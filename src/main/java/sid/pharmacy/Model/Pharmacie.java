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
	private Long id_pharmacie;
	private String nom_pharmacie;
	private int tele_pharmacie;
	private String adresse_pharmacie;
	private String ville_pharmacie;
	
	@JsonIgnore
	@OneToMany(mappedBy = "pharmacie",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Pharmacien> pharmaciens;
	
	
	public Pharmacie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pharmacie(String nom_pharmacie, int tele_pharmacie, String adresse_pharmacie, String ville_pharmacie) {
		super();
		this.nom_pharmacie = nom_pharmacie;
		this.tele_pharmacie = tele_pharmacie;
		this.adresse_pharmacie = adresse_pharmacie;
		this.ville_pharmacie = ville_pharmacie;
	}

	

	public Long getId_pharmacie() {
		return id_pharmacie;
	}

	public void setId_pharmacie(Long id_pharmacie) {
		this.id_pharmacie = id_pharmacie;
	}

	public String getNom_pharmacie() {
		return nom_pharmacie;
	}

	public void setNom_pharmacie(String nom_pharmacie) {
		this.nom_pharmacie = nom_pharmacie;
	}

	public int getTele_pharmacie() {
		return tele_pharmacie;
	}

	public void setTele_pharmacie(int tele_pharmacie) {
		this.tele_pharmacie = tele_pharmacie;
	}

	public String getAdresse_pharmacie() {
		return adresse_pharmacie;
	}

	public void setAdresse_pharmacie(String adresse_pharmacie) {
		this.adresse_pharmacie = adresse_pharmacie;
	}

	public String getVille_pharmacie() {
		return ville_pharmacie;
	}

	public void setVille_pharmacie(String ville_pharmacie) {
		this.ville_pharmacie = ville_pharmacie;
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
