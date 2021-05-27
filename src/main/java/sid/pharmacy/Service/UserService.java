package sid.pharmacy.Service;

import java.util.Set;
import sid.pharmacy.Model.Users;
import sid.pharmacy.security.UserRole;

public interface UserService {
	
	public Users findByUsername(String username);
    public Users findByEmail(String email);
    public Users findByuserId(Long id);
    
    public void save (Users user);
    public Users createUser(Users user, Set<UserRole> userRoles);
}
