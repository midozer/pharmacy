package sid.pharmacy.Service;

import java.util.List;
import java.util.Set;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import sid.pharmacy.Model.Users;
import sid.pharmacy.security.UserRole;

public interface UserService {
	
	public Users findByUsername(String username);
    public Users findByEmail(String email);
    public Users findByuserId(Long id);
    public List<Users> findAll();
    public Users deleteByUserId(Long userId);
    public void save (Users user);
    public Users createUser(Users user, Set<UserRole> userRoles);
	UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
