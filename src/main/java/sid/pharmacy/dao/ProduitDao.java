package sid.pharmacy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import sid.pharmacy.Model.Produit;

public interface ProduitDao extends CrudRepository<Produit, Long> {
	
	
	  Produit findBycodeProduit(Long codeProduit);
	  
	  List<Produit> findBytypeProduit(String typeProduit); 
	  
	  
	  List<Produit> findBynomProduit(String nomProduit); 
	  
	  List<Produit> findAll();
	  
	  //public List<Produit> search(String nomProduit);
	  
	  void deleteBynomProduit(String nomProduit);
	  
	  void deleteBycodeProduit(Long codeProduit);
}
