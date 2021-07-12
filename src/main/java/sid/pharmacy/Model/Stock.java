package sid.pharmacy.Model;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(StockId.class)
public class Stock implements Serializable {

	/*
	 * @Id private Long idStock;
	 * 
	 * 
	 * 
	 * @OneToMany(targetEntity = Produit.class, mappedBy = "stock", cascade =
	 * CascadeType.ALL, fetch = FetchType.LAZY) private List<Produit> produits = new
	 * ArrayList<>();
	 * 
	 * 
	 * 
	 * @ManyToMany
	 * 
	 * @JoinTable( name = "T_Stock_Produit_Associations", joinColumns = @JoinColumn(
	 * name = "idStock" ), inverseJoinColumns = @JoinColumn( name = "codeProduit" )
	 * ) private List<Stock> stocks = new ArrayList<>();
	 * 
	 * 
	 * 
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="codeProduit", nullable=false) private Produit codeProduit;
	 * 
	 * 
	 * @OneToMany(mappedBy = "stock", cascade = CascadeType.ALL, fetch =
	 * FetchType.LAZY) private List<Produit> produitList;
	 * 
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "idPharmacie") private Pharmacie idPharmacie;
	 * 
	 * public Pharmacie getIdPharmacie() { return idPharmacie; }
	 * 
	 * public void setIdPharmacie(Pharmacie idPharmacie) { this.idPharmacie =
	 * idPharmacie; }
	 * 
	 * private int quantite;
	 * 
	 * public Stock() { super(); // TODO Auto-generated constructor stub }
	 * 
	 * public Stock(List<Produit> produitList, Pharmacie idPharmacie, int quantite)
	 * { super(); this.produitList = produitList; this.idPharmacie = idPharmacie;
	 * this.quantite = quantite; }
	 * 
	 * public Long getIdStock() { return idStock; }
	 * 
	 * public void setIdStock(Long idStock) { this.idStock = idStock; }
	 * 
	 * 
	 * 
	 * public List<Produit> getProduitList() { return produitList; }
	 * 
	 * public void setProduitList(List<Produit> produitList) { this.produitList =
	 * produitList; }
	 * 
	 * public int getQuantite() { return quantite; }
	 * 
	 * public void setQuantite(int quantite) { this.quantite = quantite; }
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String nomPharmacie;
	
	@Id
	private String nomProduit;
	
	private int quantite;


	public int getQuantite() {
		return quantite;
	}
	
	public Stock()
	{
		
	}
	
	

	public String getNomPharmacie() {
		return nomPharmacie;
	}

	public void setNomPharmacie(String nomPharmacie) {
		this.nomPharmacie = nomPharmacie;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	
	

	public Stock(String nomPharmacie, String nomProduit, int quantite) {
		super();
		this.nomPharmacie = nomPharmacie;
		this.nomProduit = nomProduit;
		this.quantite = quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	

}
