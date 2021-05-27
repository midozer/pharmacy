package sid.pharmacy.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import sid.pharmacy.Model.Client;

public interface ClientDao extends JpaRepository<Client, Long> {
	
}
