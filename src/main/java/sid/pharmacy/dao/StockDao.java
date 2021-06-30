package sid.pharmacy.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import sid.pharmacy.Model.Pharmacie;
import sid.pharmacy.Model.Produit;
import sid.pharmacy.Model.Stock;


public interface StockDao extends CrudRepository<Stock, Long> {
	
	List<Stock> findByPharmacie(Pharmacie pharmacie); //retourne un stock d'une pharmacie
	List<Stock> findAll();
	
}
