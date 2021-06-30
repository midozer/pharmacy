/*
 * package sid.pharmacy.Model;
 * 
 * import java.util.ArrayList; import java.util.List; import
 * javax.persistence.Entity; import javax.persistence.GeneratedValue; import
 * javax.persistence.GenerationType; import javax.persistence.Id; import
 * javax.persistence.JoinColumn; import javax.persistence.JoinTable; import
 * javax.persistence.ManyToMany; import javax.persistence.ManyToOne;
 * 
 * @Entity public class Pharmacien{
 * 
 * @Id
 * 
 * @GeneratedValue(strategy=GenerationType.AUTO) private int id_pharmacien;
 * private String nom_pharmacien; private String prenom_pharmacien; private int
 * tele_pharmacien;
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name = "idPharmacie") private Pharmacie pharmacie;
 * 
 * 
 * @ManyToMany
 * 
 * @JoinTable(name = "T_Pharmacien_CommandeClient",joinColumns
 * = @JoinColumn(name="id_pharmacien"), inverseJoinColumns
 * = @JoinColumn(name="id_cmd")) private List<Commande_client> commande_clients
 * = new ArrayList<>();
 * 
 * 
 * public Pharmacien() { super(); // TODO Auto-generated constructor stub }
 * public Pharmacien(String nom_pharmacien, String prenom_pharmacien, int
 * tele_pharmacien, Pharmacie pharmacie) { super(); this.nom_pharmacien =
 * nom_pharmacien; this.prenom_pharmacien = prenom_pharmacien;
 * this.tele_pharmacien = tele_pharmacien; this.pharmacie = pharmacie; } public
 * int getId_pharmacien() { return id_pharmacien; } public void
 * setId_pharmacien(int id_pharmacien) { this.id_pharmacien = id_pharmacien; }
 * public String getNom_pharmacien() { return nom_pharmacien; } public void
 * setNom_pharmacien(String nom_pharmacien) { this.nom_pharmacien =
 * nom_pharmacien; } public String getPrenom_pharmacien() { return
 * prenom_pharmacien; } public void setPrenom_pharmacien(String
 * prenom_pharmacien) { this.prenom_pharmacien = prenom_pharmacien; } public int
 * getTele_pharmacien() { return tele_pharmacien; } public void
 * setTele_pharmacien(int tele_pharmacien) { this.tele_pharmacien =
 * tele_pharmacien; } public Pharmacie getPharmacie() { return pharmacie; }
 * public void setPharmacie(Pharmacie pharmacie) { this.pharmacie = pharmacie; }
 * 
 * public List<Commande_client> getCommande_clients() { return commande_clients;
 * }
 * 
 * }
 */