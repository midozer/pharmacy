/*
 * package sid.pharmacy.Model;
 * 
 * 
 * import javax.persistence.Entity; import javax.persistence.GeneratedValue;
 * import javax.persistence.GenerationType; import javax.persistence.Id; import
 * javax.persistence.JoinColumn; import javax.persistence.ManyToOne;
 * 
 * 
 * @Entity public class Livreur {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy=GenerationType.AUTO) private int id_liveur; private
 * String nom_livreur; private String prenom_livreur; private int tele_livreur;
 * private String cin_livreur;
 * 
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name = "id_pharmacie") private Pharmacie pharmacie;
 * 
 * public Livreur() { super(); // TODO Auto-generated constructor stub } public
 * Livreur(String nom_livreur, String prenom_livreur, int tele_livreur, String
 * cin_livreur, Pharmacie pharmacie) { super(); this.nom_livreur = nom_livreur;
 * this.prenom_livreur = prenom_livreur; this.tele_livreur = tele_livreur;
 * this.cin_livreur = cin_livreur; this.pharmacie = pharmacie; } public int
 * getId_liveur() { return id_liveur; } public void setId_liveur(int id_liveur)
 * { this.id_liveur = id_liveur; } public String getNom_livreur() { return
 * nom_livreur; } public void setNom_livreur(String nom_livreur) {
 * this.nom_livreur = nom_livreur; } public String getPrenom_livreur() { return
 * prenom_livreur; } public void setPrenom_livreur(String prenom_livreur) {
 * this.prenom_livreur = prenom_livreur; } public int getTele_livreur() { return
 * tele_livreur; } public void setTele_livreur(int tele_livreur) {
 * this.tele_livreur = tele_livreur; } public String getCin_livreur() { return
 * cin_livreur; } public void setCin_livreur(String cin_livreur) {
 * this.cin_livreur = cin_livreur; }
 * 
 * public Pharmacie getPharmacie() { return pharmacie; } public void
 * setPharmacie(Pharmacie pharmacie) { this.pharmacie = pharmacie; }
 * 
 * 
 * 
 * }
 */