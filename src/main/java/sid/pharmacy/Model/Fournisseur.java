/*
 * package sid.pharmacy.Model;
 * 
 * import javax.persistence.Entity; import javax.persistence.GeneratedValue;
 * import javax.persistence.GenerationType; import javax.persistence.Id; import
 * javax.persistence.Table;
 * 
 * 
 * @Entity
 * 
 * @Table(name="fournisseur") public class Fournisseur {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy=GenerationType.AUTO) private int id_fournisseur;
 * private String nom_fournisseur; private String prenom_fournisseur; private
 * int tele_fournisseur; private String adresse_fournisseur; private String
 * ville_fournisseur;
 * 
 * 
 * @JsonIgnore
 * 
 * @OneToMany(mappedBy = "fournisseur",fetch = FetchType.LAZY,cascade =
 * CascadeType.ALL) private List<Commande_fournisseur> commande_fournisseurs;
 * 
 * public Fournisseur() { super(); // TODO Auto-generated constructor stub }
 * public Fournisseur(String nom_fournisseur, String prenom_fournisseur, int
 * tele_fournisseur, String adresse_fournisseur, String ville_fournisseur) {
 * super(); this.nom_fournisseur = nom_fournisseur; this.prenom_fournisseur =
 * prenom_fournisseur; this.tele_fournisseur = tele_fournisseur;
 * this.adresse_fournisseur = adresse_fournisseur; this.ville_fournisseur =
 * ville_fournisseur; } public int getId_fournisseur() { return id_fournisseur;
 * } public void setId_fournisseur(int id_fournisseur) { this.id_fournisseur =
 * id_fournisseur; } public String getNom_fournisseur() { return
 * nom_fournisseur; } public void setNom_fournisseur(String nom_fournisseur) {
 * this.nom_fournisseur = nom_fournisseur; } public String
 * getPrenom_fournisseur() { return prenom_fournisseur; } public void
 * setPrenom_fournisseur(String prenom_fournisseur) { this.prenom_fournisseur =
 * prenom_fournisseur; } public int getTele_fournisseur() { return
 * tele_fournisseur; } public void setTele_fournisseur(int tele_fournisseur) {
 * this.tele_fournisseur = tele_fournisseur; } public String
 * getAdresse_fournisseur() { return adresse_fournisseur; } public void
 * setAdresse_fournisseur(String adresse_fournisseur) { this.adresse_fournisseur
 * = adresse_fournisseur; } public String getVille_fournisseur() { return
 * ville_fournisseur; } public void setVille_fournisseur(String
 * ville_fournisseur) { this.ville_fournisseur = ville_fournisseur; }
 * 
 * }
 */