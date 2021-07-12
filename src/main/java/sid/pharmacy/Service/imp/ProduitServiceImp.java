package sid.pharmacy.Service.imp;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import sid.pharmacy.Model.Produit;
import sid.pharmacy.Service.ProduitService;
import sid.pharmacy.dao.ProduitDao;

@Service
@Transactional
public class ProduitServiceImp implements ProduitService {
	
	@Autowired
	private ProduitDao produitDao;

	@Override
	public Produit findBycodeProduit(Long codeProduit) {
		return produitDao.findBycodeProduit(codeProduit);
	}

	@Override
	public List<Produit> findBytypeProduit(String typeProduit) {
		if(typeProduit != null)
		{
			return produitDao.findBytypeProduit(typeProduit);
		}
		return produitDao.findAll();
	}

	@Override
	public List<Produit> findBynomProduit(String nomProduit) {
		return produitDao.findBynomProduit(nomProduit);
	}

	@Override
	public void saveProduit(Produit produit) {
		produitDao.save(produit);
	}

	public List<Produit> findAll() {
		
		return produitDao.findAll();
	}

	@Override
	public Produit createProduit(Produit produit) {
		return produitDao.save(produit);
	}

	@Override
	public void updateProduit(Long codeProduit) {
		produitDao.findBycodeProduit(codeProduit).getCodeProduit();
	}

	@Override
	public void deleteBynomProduit(String nomProduit) {
		produitDao.deleteBynomProduit(nomProduit);
	}

	@Override
	public void deleteBycodeProduit(Long codeProduit) {
		produitDao.deleteBycodeProduit(codeProduit);
	}

	@Override
	public Page<Produit> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
			Sort.by(sortField).descending();
		
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
		return this.produitDao.findAll(pageable);
	}

	/*
	 * @Override public List<Produit> search(String nomProduit) { if(nomProduit !=
	 * null) { return produitDao.search(nomProduit); } return produitDao.findAll();
	 * }
	 */



	

}
