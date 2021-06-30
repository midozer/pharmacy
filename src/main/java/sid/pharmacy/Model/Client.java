/*
 * package sid.pharmacy.Model;
 * 
 * import java.util.List;
 * 
 * import javax.persistence.CascadeType; import javax.persistence.Column; import
 * javax.persistence.Entity; import javax.persistence.FetchType; import
 * javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
 * import javax.persistence.Id; import javax.persistence.OneToMany; import
 * javax.persistence.Table;
 * 
 * import com.fasterxml.jackson.annotation.JsonIgnore;
 * 
 * @Entity
 * 
 * @Table(name="client") public class Client {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy=GenerationType.AUTO)
 * 
 * @Column(name = "client_id") private int id_client;
 * 
 * @Column(name = "client_nom") private String nom_client;
 * 
 * @Column(name = "client_prenom") private String prenom_client;
 * 
 * @Column(name = "client_telephone") private int tele_client;
 * 
 * @Column(name = "client_adresse") private String adresse_client;
 * 
 * @Column(name = "client_ville") private String ville_client;
 * 
 * @Column(name = "client_cin") private String cin_client;
 * 
 * @JsonIgnore
 * 
 * @OneToMany(mappedBy = "client",fetch = FetchType.LAZY,cascade =
 * CascadeType.ALL) private List<Commande_client> commande_clients; public
 * Client() { super(); // TODO Auto-generated constructor stub } public
 * Client(String nom_client, String prenom_client, int tele_client, String
 * adresse_client, String ville_client, String cin_client, List<Commande_client>
 * commande_clients) { super(); this.nom_client = nom_client; this.prenom_client
 * = prenom_client; this.tele_client = tele_client; this.adresse_client =
 * adresse_client; this.ville_client = ville_client; this.cin_client =
 * cin_client; this.commande_clients = commande_clients; } public int
 * getId_client() { return id_client; } public void setId_client(int id_client)
 * { this.id_client = id_client; } public String getNom_client() { return
 * nom_client; } public void setNom_client(String nom_client) { this.nom_client
 * = nom_client; } public String getPrenom_client() { return prenom_client; }
 * public void setPrenom_client(String prenom_client) { this.prenom_client =
 * prenom_client; } public int getTele_client() { return tele_client; } public
 * void setTele_client(int tele_client) { this.tele_client = tele_client; }
 * public String getAdresse_client() { return adresse_client; } public void
 * setAdresse_client(String adresse_client) { this.adresse_client =
 * adresse_client; } public String getVille_client() { return ville_client; }
 * public void setVille_client(String ville_client) { this.ville_client =
 * ville_client; } public String getCin_client() { return cin_client; } public
 * void setCin_client(String cin_client) { this.cin_client = cin_client; }
 * public List<Commande_client> getCommande_clients() { return commande_clients;
 * } public void setCommande_clients(List<Commande_client> commande_clients) {
 * this.commande_clients = commande_clients; }
 * 
 * 
 * }
 */