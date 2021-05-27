package sid.pharmacy.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import sid.pharmacy.Model.Pharmacie;


public interface PharmacieDao extends CrudRepository<Pharmacie , Long> {
	
	Pharmacie findByidPharmacie(Long idPharmacie);
	Pharmacie findBynomPharmacie(String nomPharmacie);
	Pharmacie findByadressePharmacie(String adressePharmacie);
	
	List<Pharmacie> findAll();
}
