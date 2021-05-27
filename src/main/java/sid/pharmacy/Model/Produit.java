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
import javax.persistence.Table;

@Entity
@Table(name="produit")
public class Produit{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idProduit;
	private String nomProduit;
	private Date dateExpiration;
	private String typeProduit;
	private String description;
	
	@ManyToMany
	@JoinTable(name = "Produits_CmdClient_Associations",joinColumns = @JoinColumn(name="idProduit"),
	inverseJoinColumns = @JoinColumn(name="id_cmd"))
	private List<Commande_client> commande_clients = new ArrayList<>();
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Produit(String nomProduit, Date dateExpiration, String typeProduit, String description,List<Commande_client> commande_clients) {
		super();
		this.nomProduit = nomProduit;
		this.dateExpiration = dateExpiration;
		this.typeProduit = typeProduit;
		this.description = description;
		this.commande_clients = commande_clients;
	}
	
	
	

	public String getNom_produit() {
		return nomProduit;
	}

	public void setNom_produit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public Long getId_produit() {
		return idProduit;
	}

	public void setId_produit(Long idProduit) {
		this.idProduit = idProduit;
	}

	public Date getDate_expiration() {
		return dateExpiration;
	}

	public void setDate_expiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	public String getType_produit() {
		return typeProduit;
	}

	public void setType_produit(String typeProduit) {
		this.typeProduit = typeProduit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Commande_client> getCommande_clients() {
		return commande_clients;
	}

	public void setCommande_clients(List<Commande_client> commande_clients) {
		this.commande_clients = commande_clients;
	}
	
	public List<Commande_client> geCommande_clients()
	{
		return commande_clients;
	}
}
