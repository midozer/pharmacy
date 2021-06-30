/*
 * package sid.pharmacy.Model;
 * 
 * import java.util.ArrayList; import java.util.Date; import java.util.List;
 * import javax.persistence.Entity; import javax.persistence.GeneratedValue;
 * import javax.persistence.GenerationType; import javax.persistence.Id; import
 * javax.persistence.JoinColumn; import javax.persistence.JoinTable; import
 * javax.persistence.ManyToMany; import javax.persistence.ManyToOne; import
 * javax.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name="commande_client") public class Commande_client {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy=GenerationType.AUTO) private int id_cmd; private
 * Date date_cmd; private String lieu_cmd;
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name = "id_client") private Client client;
 * 
 * @ManyToMany
 * 
 * @JoinTable(name = "Produits_CmdClient_Associations",joinColumns
 * = @JoinColumn(name="id_cmd"), inverseJoinColumns
 * = @JoinColumn(name="codeProduit")) private List<Produit> produits = new
 * ArrayList<>();
 * 
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name = "id_mode") private Mode_paiement mode_paiement;
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name = "id_facture") private Facture_client facture_client;
 * 
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name = "id_livraison") private Livraison livraison;
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name = "id_pharmacien") private Pharmacien pharmacien;
 * 
 * public Commande_client() { super(); // TODO Auto-generated constructor stub }
 * 
 * 
 * public Commande_client(Date date_cmd, String lieu_cmd, Client client,
 * List<Produit> produits, Mode_paiement mode_paiement, Facture_client
 * facture_client, Livraison livraison, Pharmacien pharmacien) { super();
 * this.date_cmd = date_cmd; this.lieu_cmd = lieu_cmd; this.client = client;
 * this.produits = produits; this.mode_paiement = mode_paiement;
 * this.facture_client = facture_client; this.livraison = livraison;
 * this.pharmacien = pharmacien; }
 * 
 * 
 * public int getId_cmd() { return id_cmd; }
 * 
 * 
 * public void setId_cmd(int id_cmd) { this.id_cmd = id_cmd; }
 * 
 * 
 * public Date getDate_cmd() { return date_cmd; }
 * 
 * 
 * public void setDate_cmd(Date date_cmd) { this.date_cmd = date_cmd; }
 * 
 * 
 * public String getLieu_cmd() { return lieu_cmd; }
 * 
 * 
 * public void setLieu_cmd(String lieu_cmd) { this.lieu_cmd = lieu_cmd; }
 * 
 * 
 * public Client getClient() { return client; }
 * 
 * 
 * public void setClient(Client client) { this.client = client; }
 * 
 * 
 * public List<Produit> getProduits() { return produits; }
 * 
 * 
 * public void setProduits(List<Produit> produits) { this.produits = produits; }
 * 
 * 
 * public Mode_paiement getMode_paiement() { return mode_paiement; }
 * 
 * 
 * public void setMode_paiement(Mode_paiement mode_paiement) {
 * this.mode_paiement = mode_paiement; }
 * 
 * 
 * public Facture_client getFacture_client() { return facture_client; }
 * 
 * 
 * public void setFacture_client(Facture_client facture_client) {
 * this.facture_client = facture_client; }
 * 
 * 
 * public Livraison getLivraison() { return livraison; }
 * 
 * 
 * public void setLivraison(Livraison livraison) { this.livraison = livraison; }
 * 
 * 
 * public Pharmacien getPharmacien() { return pharmacien; }
 * 
 * 
 * public void setPharmacien(Pharmacien pharmacien) { this.pharmacien =
 * pharmacien; }
 * 
 * 
 * public List<Produit> geProduits() { return produits; } }
 */