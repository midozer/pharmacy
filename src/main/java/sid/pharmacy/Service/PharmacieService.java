package sid.pharmacy.Service;



import java.util.List;

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
}
