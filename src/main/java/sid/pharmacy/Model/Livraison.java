package sid.pharmacy.Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="livraison")
public class Livraison {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_livraison;
	private Date date_livraison;
	
	@ManyToOne
	@JoinColumn(name = "id_liveur")
	private Livreur livreur;
	
	public Livraison() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Livraison(Date date_livraison, Livreur livreur) {
		super();
		this.date_livraison = date_livraison;
		this.livreur = livreur;
	}

	public int getId_livraison() {
		return id_livraison;
	}

	public void setId_livraison(int id_livraison) {
		this.id_livraison = id_livraison;
	}

	public Date getDate_livraison() {
		return date_livraison;
	}

	public void setDate_livraison(Date date_livraison) {
		this.date_livraison = date_livraison;
	}

	public Livreur getLivreur() {
		return livreur;
	}

	public void setLivreur(Livreur livreur) {
		this.livreur = livreur;
	}

	
}
