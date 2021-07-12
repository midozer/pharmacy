package sid.pharmacy.Service;


import java.util.List;

import org.springframework.stereotype.Service;

import sid.pharmacy.Model.Pharmacie;
import sid.pharmacy.Model.Produit;
import sid.pharmacy.Model.Stock;

@Service
public interface StockService {
	
	//public Stock findByIdStock(Long idStock);
	
	public Pharmacie findByNomPharmacie(String nomPharmacie);
	
	public Stock findByQuantite(int quantite);
	
	public List<Produit> findByNomProduit(String nomProduit);
	
	public List<Stock> findAll();
	
	public void deleteByQuantite(int quantite);

	//public Stock saveQuantite(int quantite);
	
	public void updateQuantite(int quantite);
}
