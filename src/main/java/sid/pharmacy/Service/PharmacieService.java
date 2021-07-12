package sid.pharmacy.Service;



import java.util.List;

import javax.naming.NameNotFoundException;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import sid.pharmacy.Model.Pharmacie;

@Service
public interface PharmacieService {
	
	public Pharmacie findByidPharmacie(Long idPharmacie);
	public Pharmacie findBynomPharmacie(String nomPharmacie);
	public Pharmacie findByadressePharmacie(String adressePharmacie);
	public List<Pharmacie> findAll();
	
	public void savePharmacie(Pharmacie pharmacie);
	
	public Pharmacie createPharmacie(Pharmacie pharmacie);
	
	public void updatePharmacie(Long idPharmacie);
	
	public void deleteBynomPharmacie(String nomPharmacie);
	
	UserDetails loadPharmacieByName(String nomPharmacie) throws NameNotFoundException;
}
