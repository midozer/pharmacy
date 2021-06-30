/*
 * package sid.pharmacy.Model;
 * 
 * import java.util.Date; import javax.persistence.Entity; import
 * javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
 * import javax.persistence.Id; import javax.persistence.JoinColumn; import
 * javax.persistence.ManyToOne; import javax.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name="commande_fournisseur") public class Commande_fournisseur {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy=GenerationType.AUTO) private int id_cmd; private
 * Date date_cmd; private String lieu_cmd;
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name = "id_pharmacien") private Pharmacien pharmacien;
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name="id_fournisseur") private Fournisseur fournisseur;
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name = "idProduit") private Produit produit;
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name = "id_bon") private Bon_reception bon_reception;
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name="id_fact") private Facture_fournisseur facture_fournisseur;
 * 
 * public Commande_fournisseur() { super(); // TODO Auto-generated constructor
 * stub } public Commande_fournisseur(Date date_cmd, String lieu_cmd, Pharmacien
 * pharmacien, Fournisseur fournisseur, Produit produit, Bon_reception
 * bon_reception, Facture_fournisseur facture_fournisseur) { super();
 * this.date_cmd = date_cmd; this.lieu_cmd = lieu_cmd; this.pharmacien =
 * pharmacien; this.fournisseur = fournisseur; this.produit = produit;
 * this.bon_reception = bon_reception; this.facture_fournisseur =
 * facture_fournisseur; } public int getId_cmd() { return id_cmd; } public void
 * setId_cmd(int id_cmd) { this.id_cmd = id_cmd; } public Date getDate_cmd() {
 * return date_cmd; } public void setDate_cmd(Date date_cmd) { this.date_cmd =
 * date_cmd; } public String getLieu_cmd() { return lieu_cmd; } public void
 * setLieu_cmd(String lieu_cmd) { this.lieu_cmd = lieu_cmd; } public Pharmacien
 * getPharmacien() { return pharmacien; } public void setPharmacien(Pharmacien
 * pharmacien) { this.pharmacien = pharmacien; } public Fournisseur
 * getFournisseur() { return fournisseur; } public void
 * setFournisseur(Fournisseur fournisseur) { this.fournisseur = fournisseur; }
 * public Produit getProduit() { return produit; } public void
 * setProduit(Produit produit) { this.produit = produit; } public Bon_reception
 * getBon_reception() { return bon_reception; } public void
 * setBon_reception(Bon_reception bon_reception) { this.bon_reception =
 * bon_reception; } public Facture_fournisseur getFacture_fournisseur() { return
 * facture_fournisseur; } public void setFacture_fournisseur(Facture_fournisseur
 * facture_fournisseur) { this.facture_fournisseur = facture_fournisseur; }
 * 
 * }
 */