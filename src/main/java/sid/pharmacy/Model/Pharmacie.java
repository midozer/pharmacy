package sid.pharmacy.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="pharmacie")
public class Pharmacie{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idPharmacie;
	private String nomPharmacie;
	private int telePharmacie;
	private String adressePharmacie;
	private String villePharmacie;
	
	@JsonIgnore
	@OneToMany(mappedBy = "pharmacie",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Pharmacien> pharmaciens;
	
	
	public Pharmacie() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Pharmacie(String nomPharmacie, int telePharmacie, String adressePharmacie, String villePharmacie) {
		super();
		this.nomPharmacie = nomPharmacie;
		this.telePharmacie = telePharmacie;
		this.adressePharmacie = adressePharmacie;
		this.villePharmacie = villePharmacie;
	}
	
	
	public Long getIdPharmacie() {
		return idPharmacie;
	}
	public void setIdPharmacie(Long idPharmacie) {
		this.idPharmacie = idPharmacie;
	}



	public String getNomPharmacie() {
		return nomPharmacie;
	}



	public void setNomPharmacie(String nomPharmacie) {
		this.nomPharmacie = nomPharmacie;
	}



	public int getTelePharmacie() {
		return telePharmacie;
	}



	public void setTelePharmacie(int telePharmacie) {
		this.telePharmacie = telePharmacie;
	}



	public String getAdressePharmacie() {
		return adressePharmacie;
	}



	public void setAdressePharmacie(String adressePharmacie) {
		this.adressePharmacie = adressePharmacie;
	}



	public String getVillePharmacie() {
		return villePharmacie;
	}



	public void setVillePharmacie(String villePharmacie) {
		this.villePharmacie = villePharmacie;
	}



	public List<Pharmacien> getPharmaciens() {
		return pharmaciens;
	}

	public void setPharmaciens(List<Pharmacien> pharmaciens) {
		this.pharmaciens = pharmaciens;
	}

	

	/*
	 * public List<Pharmacien> getPharmaciens() { return pharmaciens; }
	 * 
	 * 
	 * 
	 * public void setPharmaciens(List<Pharmacien> pharmaciens) { this.pharmaciens =
	 * pharmaciens; }
	 * 
	 */
	
}
