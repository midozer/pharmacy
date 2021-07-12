package sid.pharmacy.Service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import sid.pharmacy.Model.Produit;

@Service
public interface ProduitService {
	
	  public Produit findBycodeProduit(Long codeProduit);
	  
	  public List<Produit> findBytypeProduit(String typeProduit);
	  
	  public List<Produit> findBynomProduit(String nomProduit);
	  
	  public List<Produit> findAll();
	  
	  //public List<Produit> search(String nomProduit);
	  
	  public void saveProduit(Produit produit);
	 
	  public Produit createProduit(Produit produit);
	  
	  public void updateProduit(Long codeProduit);
	  
	  public void deleteBynomProduit(String nomProduit);
	  
	  public void deleteBycodeProduit(Long codeProduit);
	  
	  Page<Produit> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
