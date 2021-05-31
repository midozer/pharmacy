package sid.pharmacy.Service.imp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sid.pharmacy.Model.Pharmacie;
import sid.pharmacy.Service.PharmacieService;
import sid.pharmacy.dao.PharmacieDao;

@Service
@Transactional
public class PharmacieServiceImp implements PharmacieService {

	@Autowired
	private PharmacieDao pharmacieDao;
	
	@Override
	public Pharmacie findByidPharmacie(Long idPharmacie) {
		return pharmacieDao.findByidPharmacie(idPharmacie);
	}

	@Override
	public Pharmacie findBynomPharmacie(String nomPharmacie) {
		return pharmacieDao.findBynomPharmacie(nomPharmacie);
	}

	@Override
	public Pharmacie findByadressePharmacie(String adressePharmacie) {
		return pharmacieDao.findByadressePharmacie(adressePharmacie);
	}

	@Override
	public void savePharmacie(Pharmacie pharmacie) {
		pharmacieDao.save(pharmacie);
	}

	@Override
	public Pharmacie createPharmacie(Pharmacie pharmacie) {
		return pharmacieDao.save(pharmacie);
	}

	@Override
	public List<Pharmacie> findAll() {
		return pharmacieDao.findAll();
	}

	@Override
	public void deleteBynomPharmacie(String nomPharmacie) {
		pharmacieDao.deleteBynomPharmacie(nomPharmacie);
	}

	@Override
	public void updatePharmacie(Long idPharmacie) {
		pharmacieDao.findByidPharmacie(idPharmacie);
	}

	
}
