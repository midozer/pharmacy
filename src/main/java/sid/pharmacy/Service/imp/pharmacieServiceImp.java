package sid.pharmacy.Service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Component;

import sid.pharmacy.Model.Pharmacie;
import sid.pharmacy.Service.PharmacieService;
import sid.pharmacy.dao.PharmacieDao;

@Service
@Transactional
@Component
public class pharmacieServiceImp implements PharmacieService {

	/*
	 * @Autowired private PharmacieDao pharmacieDao;
	 * 
	 * @Override public Pharmacie findByName(String nom_pharmacie) { return
	 * pharmacieDao.findByName(nom_pharmacie); }
	 * 
	 * @Override public Pharmacie findById(Long id_pharmacie) { return
	 * pharmacieDao.findByIdpharmacie(id_pharmacie); }
	 * 
	 * 
	 * @Override public void savePharmacie(Pharmacie pharmacie) {
	 * pharmacieDao.save(pharmacie); }
	 * 
	 * @Override public void deletePharmacie(Long id_pharmacie) { }
	 * 
	 * @Override public void updatePharmacie(Long id_pharmacie) { }
	 * 
	 * 
	 * @Override public List<Pharmacie> findAll() { return pharmacieDao.findAll(); }
	 */
}
