package sid.pharmacy.Service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sid.pharmacy.Model.Produit;
import sid.pharmacy.Service.ProduitService;
import sid.pharmacy.dao.ProduitDao;

@Service
@Transactional
public class ProduitServiceImp implements ProduitService {
	
	@Autowired
	private ProduitDao produitDao;

	@Override
	public Produit findByidProduit(Long idProduit) {
		return produitDao.findByidProduit(idProduit);
	}

	@Override
	public Produit findBytypeProduit(String typeProduit) {
		return produitDao.findBytypeProduit(typeProduit);
	}

	@Override
	public Produit findBynomProduit(String nomProduit) {
		return produitDao.findBynomProduit(nomProduit);
	}

	@Override
	public void saveProduit(Produit produit) {
		produitDao.save(produit);
	}

	@Override
	public List<Produit> findAll() {
		return produitDao.findAll();
	}

	@Override
	public Produit createProduit(Produit produit) {
		return produitDao.save(produit);
	}

	@Override
	public void updateProduit(Long idProduit) {
		produitDao.findByidProduit(idProduit).getId_produit();
	}

	@Override
	public void deleteBynomProduit(String nomProduit) {
		produitDao.deleteBynomProduit(nomProduit);
	}

	

}
