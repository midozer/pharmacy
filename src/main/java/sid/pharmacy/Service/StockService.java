package sid.pharmacy.Service;


import java.util.List;

import org.springframework.stereotype.Service;

import sid.pharmacy.Model.Pharmacie;
import sid.pharmacy.Model.Produit;
import sid.pharmacy.Model.Stock;

@Service
public interface StockService {
	
	public List<Stock> findByPharmacie(Pharmacie pharmacie);
	public List<Stock> findAll();

	public Stock save(Stock stock);
}
