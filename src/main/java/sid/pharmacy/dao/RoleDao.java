package sid.pharmacy.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import sid.pharmacy.security.Role;

public interface RoleDao extends CrudRepository<Role, Integer> {
	Role findByName(String name);
	
	List<Role> findAll();
}
