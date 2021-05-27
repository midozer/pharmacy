package sid.pharmacy.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="facture_client")
public class Facture_client {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_facture;
	private double montant;
	
	
	
	@ManyToOne
	@JoinColumn(name = "cmd_id")
	private Commande_client commande_client;
	public Facture_client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Facture_client(double montant, Commande_client commande_client) {
		super();
		this.montant = montant;
		this.commande_client = commande_client;
	}
	public int getId_facture() {
		return id_facture;
	}
	public void setId_facture(int id_facture) {
		this.id_facture = id_facture;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Commande_client getCommande_client() {
		return commande_client;
	}
	public void setCommande_client(Commande_client commande_client) {
		this.commande_client = commande_client;
	}
	
	
}
