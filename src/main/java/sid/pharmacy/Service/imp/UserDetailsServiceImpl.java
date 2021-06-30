/*
 * package sid.pharmacy.Service.imp;
 * 
 * import java.util.HashSet; import java.util.Set; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.GrantedAuthority; import
 * org.springframework.security.core.authority.SimpleGrantedAuthority; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * import org.springframework.stereotype.Service; import
 * org.springframework.transaction.annotation.Transactional; import
 * sid.pharmacy.Model.Users; import sid.pharmacy.dao.UserDao; import
 * sid.pharmacy.security.Role; import sid.pharmacy.security.UserRole;
 * 
 * @Service public class UserDetailsServiceImpl implements UserDetailsService{
 * 
 * @Autowired private UserDao userDao;
 * 
 * @Override
 * 
 * @Transactional(readOnly = true) public UserDetails loadUserByUsername(String
 * username) { Users user = userDao.findByUsername(username); if (user == null)
 * throw new UsernameNotFoundException(username);
 * 
 * Set<GrantedAuthority> grantedAuthorities = new HashSet<>(); for (UserRole
 * role : user.getUserRoles()){ grantedAuthorities.add(new
 * SimpleGrantedAuthority(role.getUserRoles())); }
 * 
 * return new
 * org.springframework.security.core.userdetails.User(user.getUsername(),
 * user.getPassword(), grantedAuthorities); } }
 */