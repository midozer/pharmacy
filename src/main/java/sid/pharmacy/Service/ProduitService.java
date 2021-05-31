package sid.pharmacy.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import sid.pharmacy.Model.Produit;

@Service
public interface ProduitService {
	
	  public Produit findByidProduit(Long idProduit); 
	  public Produit findBytypeProduit(String typeProduit); 
	  public Produit findBynomProduit(String nomProduit);
	  public List<Produit> findAll();
	  
	  public void saveProduit(Produit produit);
	 
	  public Produit createProduit(Produit produit);
	  
	  public void updateProduit(Long idProduit);
	  
	  public void deleteBynomProduit(String nomProduit);
}
