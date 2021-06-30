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
	public List<Stock> findByPharmacie(Pharmacie pharmacie) {
		return stockDao.findByPharmacie(pharmacie);
	}


	@Override
	public List<Stock> findAll() {
		return stockDao.findAll();
	}


	@Override
	public Stock save(Stock stock) {
		return stockDao.save(stock);
	}
	
	
}
