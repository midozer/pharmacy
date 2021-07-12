package sid.pharmacy.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import sid.pharmacy.Model.Pharmacie;
import sid.pharmacy.Model.Produit;
import sid.pharmacy.Model.Stock;
import sid.pharmacy.Model.StockId;


public interface StockDao extends CrudRepository<Stock, StockId> {
	
	//Stock findByIdStock(Long idStock);
	
	Pharmacie findByNomPharmacie(String nomPharmacie);
	
	//Pharmacie findByIdPharmacie(Pharmacie pharmacie); //retourne un stock d'une pharmacie
	
	List<Produit> findByNomProduit(String nomProduit);
	
	Stock findByQuantite(int quantite);
	
	void deleteByQuantite(int quantite);
	
	List<Stock> findAll();

	//Stock saveQuantite(int quantite);
	
}
