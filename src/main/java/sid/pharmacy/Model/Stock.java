package sid.pharmacy.Model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Stock {
	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy=GenerationType.AUTO) private Long id_stock; private
	 * int quantite;
	 * 
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "pharmacie") private Pharmacie pharmacie;
	 * 
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "produit") private Produit produit; public Stock() {
	 * super(); // TODO Auto-generated constructor stub }
	 * 
	 * public Stock(int quantite, Pharmacie pharmacie, Produit produit) { super();
	 * this.quantite = quantite; this.pharmacie = pharmacie; this.produit = produit;
	 * }
	 * 
	 * public Long getId_stock() { return id_stock; } public void setId_stock(Long
	 * id_stock) { this.id_stock = id_stock; } public int getQuantite() { return
	 * quantite; } public void setQuantite(int quantite) { this.quantite = quantite;
	 * } public Pharmacie getPharmacie() { return pharmacie; } public void
	 * setPharmacie(Pharmacie pharmacie) { this.pharmacie = pharmacie; } public
	 * Produit getProduit() { return produit; } public void setProduit(Produit
	 * produit) { this.produit = produit; }
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idStock;
	
	
	/*
	 * @OneToMany(targetEntity = Produit.class, mappedBy = "stock", cascade =
	 * CascadeType.ALL, fetch = FetchType.LAZY) private List<Produit> produits = new
	 * ArrayList<>();
	 */
	
	/*
	 * @ManyToMany
	 * 
	 * @JoinTable( name = "T_Stock_Produit_Associations", joinColumns = @JoinColumn(
	 * name = "idStock" ), inverseJoinColumns = @JoinColumn( name = "codeProduit" )
	 * ) private List<Stock> stocks = new ArrayList<>();
	 */
	
	@ManyToOne @JoinColumn(name="codeProduit", nullable=false)
    private Produit produit;
	
	@OneToOne
	@JoinColumn(name = "idPharmacie")
	private Pharmacie pharmacie;
	
	private int quantite;
	
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stock(/* List<Produit> produits, */ Pharmacie pharmacie, int quantite) {
		super();
		//this.produits = produits;
		this.pharmacie = pharmacie;
		this.quantite = quantite;
	}

	public Long getIdStock() {
		return idStock;
	}

	public void setIdStock(Long idStock) {
		this.idStock = idStock;
	}

	/*
	 * public List<Produit> getProduits() { return produits; }
	 * 
	 * public void setProduits(List<Produit> produits) { this.produits = produits; }
	 */

	public Pharmacie getPharmacie() {
		return pharmacie;
	}

	public void setPharmacie(Pharmacie pharmacie) {
		this.pharmacie = pharmacie;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	public Produit getProduit() {
		return produit;
	}
}
