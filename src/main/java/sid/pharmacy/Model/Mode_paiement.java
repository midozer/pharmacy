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
 * @Table(name="mode_paiement") public class Mode_paiement {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy=GenerationType.AUTO) private int id_mode; private
 * String type_paiement;
 * 
 * 
 * @JsonIgnore
 * 
 * @OneToMany(mappedBy = "mode_paiement",fetch = FetchType.LAZY,cascade =
 * CascadeType.ALL) private List<Commande_client> commande_clients;
 * 
 * 
 * public Mode_paiement() { super(); // TODO Auto-generated constructor stub }
 * public Mode_paiement(String type_paiement) { super(); this.type_paiement =
 * type_paiement; } public int getId_mode() { return id_mode; } public void
 * setId_mode(int id_mode) { this.id_mode = id_mode; } public String
 * getType_paiement() { return type_paiement; } public void
 * setType_paiement(String type_paiement) { this.type_paiement = type_paiement;
 * } }
 */