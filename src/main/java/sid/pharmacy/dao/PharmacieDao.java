package sid.pharmacy.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import sid.pharmacy.Model.Pharmacie;


public interface PharmacieDao extends CrudRepository<Pharmacie , Long> {
	
	/*
	 * Pharmacie findByName(String nom_pharmacie); Pharmacie findByIdpharmacie(Long
	 * id_pharmacie); List<Pharmacie> findAll();
	 */
}
