package sid.pharmacy.Service.imp;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sid.pharmacy.Model.Users;
import sid.pharmacy.Service.UserService;
import sid.pharmacy.dao.RoleDao;
import sid.pharmacy.dao.UserDao;
import sid.pharmacy.security.UserRole;

@Service
@Transactional
public class UserServiceImp implements UserService {

	private static final Logger LOG = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
    private RoleDao roleDao;
	
	/*
	 * @Autowired private AccountService accountService;
	 */
	
	@Autowired
    private BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public Users findByUsername(String username) {
		return userDao.findByUsername(username);
	}

	@Override
	public Users findByEmail(String email) {
		return userDao.findByEmail(email);
	}

	@Override
	public Users findByuserId(Long id) {
		return userDao.findByuserId(id);
	}

	@Override
	public void save(Users user) {
		userDao.save(user);
	}

	@Override
	public Users createUser(Users user, Set<UserRole> userRoles) {
		Users localUser = userDao.findByUsername(user.getUsername());

        if (localUser != null) {
            LOG.info("User with username {} already exist. Nothing will be done. ", user.getUsername());
        } else {
            String encryptedPassword = passwordEncoder.encode(user.getPassword());
            user.setPassword(encryptedPassword);

            for (UserRole ur : userRoles) {
                roleDao.save(ur.getRole());
            }

            user.getUserRoles().addAll(userRoles);


            localUser = userDao.save(user);
        }

        return localUser;
	}

}
