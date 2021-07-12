package sid.pharmacy.Service.imp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sid.pharmacy.Model.Pharmacie;
import sid.pharmacy.Model.Produit;
import sid.pharmacy.Model.Stock;
import sid.pharmacy.Service.StockService;
import sid.pharmacy.dao.StockDao;

@Service
@Transactional
public class StockServiceImp implements StockService  {

	@Autowired
	private StockDao stockDao;

	@Override
	public List<Stock> findAll() {
		return stockDao.findAll();
	}


	@Override
	public void deleteByQuantite(int quantite) {
		stockDao.deleteByQuantite(quantite);
	}

	@Override
	public void updateQuantite(int quantite) {
		stockDao.findByQuantite(quantite).getQuantite();
	}


	@Override
	public Stock findByQuantite(int quantite) {
		return stockDao.findByQuantite(quantite);
	}


	@Override
	public Pharmacie findByNomPharmacie(String nomPharmacie) {
		return stockDao.findByNomPharmacie(nomPharmacie);
	}


	@Override
	public List<Produit> findByNomProduit(String nomProduit) {
		return stockDao.findByNomProduit(nomProduit);
	}

	
	
	
	
}
