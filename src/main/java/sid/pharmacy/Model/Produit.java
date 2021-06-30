package sid.pharmacy.Model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Produit{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long codeProduit;
	private String nomProduit;
	private Date dateExpiration;
	private String typeProduit;
	private String description;
	private Double prix;
	
	
	/*
	 * @ManyToOne(fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name = "idStock", nullable = false) private Stock stock;
	 */

	/*
	 * @ManyToMany
	 * 
	 * @JoinTable( name = "T_Stock_Produit_Associations", joinColumns = @JoinColumn(
	 * name = "codeProduit" ), inverseJoinColumns = @JoinColumn( name = "idStock" )
	 * ) private List<Produit> produits = new ArrayList<>();
	 */
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Produit(String nomProduit, Date dateExpiration, String typeProduit, String description, Double prix) {
		super();
		this.nomProduit = nomProduit;
		this.dateExpiration = dateExpiration;
		this.typeProduit = typeProduit;
		this.description = description;
		this.prix = prix;
	}




	public Long getCodeProduit() {
		return codeProduit;
	}




	public void setCodeProduit(Long codeProduit) {
		this.codeProduit = codeProduit;
	}




	public String getNomProduit() {
		return nomProduit;
	}




	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}




	public Date getDateExpiration() {
		return dateExpiration;
	}




	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
	}




	public String getTypeProduit() {
		return typeProduit;
	}




	public void setTypeProduit(String typeProduit) {
		this.typeProduit = typeProduit;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public Double getPrix() {
		return prix;
	}




	public void setPrix(Double prix) {
		this.prix = prix;
	}
	
	

	/*
	 * public List<Commande_client> getCommande_clients() { return commande_clients;
	 * }
	 * 
	 * public void setCommande_clients(List<Commande_client> commande_clients) {
	 * this.commande_clients = commande_clients; }
	 */

	/*
	 * public Stock getStock() { return stock; }
	 * 
	 * public void setStock(Stock stock) { this.stock = stock; }
	 */
	
	
}
