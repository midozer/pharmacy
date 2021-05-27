package sid.pharmacy.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import sid.pharmacy.Model.Produit;

public interface ProduitDao extends CrudRepository<Produit, Long> {
	
	
	  Produit findByidProduit(Long idProduit); 
	  Produit findBytypeProduit(String typeProduit); 
	  Produit findBynomProduit(String nomProduit); 
	  List<Produit> findAll();
	 
}
