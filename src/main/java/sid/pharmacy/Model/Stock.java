package sid.pharmacy.Model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="stock")
public class Stock {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id_stock;
	private int quantite;
	
	@OneToOne
	@JoinColumn(name = "id_pharmacie")
	private Pharmacie pharmacie;
	
	@ManyToOne
	@JoinColumn(name = "idProduit")
	private Produit produit;
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stock(int quantite, Produit produit) {
		super();
		this.quantite = quantite;
		this.produit = produit;
	}
	public int getId_stock() {
		return id_stock;
	}
	public void setId_stock(int id_stock) {
		this.id_stock = id_stock;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Pharmacie getPharmacie() {
		return pharmacie;
	}
	public void setPharmacie(Pharmacie pharmacie) {
		this.pharmacie = pharmacie;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	
}
