package sid.pharmacy.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import sid.pharmacy.Model.Users;

public interface UserDao extends CrudRepository<Users, Long> {
	Users findByUsername(String username);
    Users findByEmail(String email);
    Users findByuserId(Long id);
    List<Users> findAll();
    
    Users deleteByUserId(Long userId);
    
    
}
