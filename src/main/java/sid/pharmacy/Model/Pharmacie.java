package sid.pharmacy.Model;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="pharmacie")
public class Pharmacie{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idPharmacie;
	private String nomPharmacie;
	private int telePharmacie;
	private String adressePharmacie;
	private String villePharmacie;
	
	
	/*
	 * @OneToOne(fetch = FetchType.LAZY, optional = false)
	 * 
	 * @JoinColumn(name = "stock_id", nullable = false) private StockId stockId;
	 */
	
	/*
	 * @JsonIgnore private Stock stock;
	 */
	
	/*
	 * @JsonIgnore
	 * 
	 * @OneToMany(mappedBy = "pharmacie",fetch = FetchType.LAZY,cascade =
	 * CascadeType.ALL) private List<Pharmacien> pharmaciens;
	 */
	
	public Pharmacie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pharmacie(String nomPharmacie, int telePharmacie, String adressePharmacie,
			String villePharmacie/*
									 * , Stock stock
									 */) {
		super();
		this.nomPharmacie = nomPharmacie;
		this.telePharmacie = telePharmacie;
		this.adressePharmacie = adressePharmacie;
		this.villePharmacie = villePharmacie;
		//this.stock = stock;
	}

	public Long getIdPharmacie() {
		return idPharmacie;
	}

	public void setIdPharmacie(Long idPharmacie) {
		this.idPharmacie = idPharmacie;
	}

	public String getNomPharmacie() {
		return nomPharmacie;
	}

	public void setNomPharmacie(String nomPharmacie) {
		this.nomPharmacie = nomPharmacie;
	}

	public int getTelePharmacie() {
		return telePharmacie;
	}

	public void setTelePharmacie(int telePharmacie) {
		this.telePharmacie = telePharmacie;
	}

	public String getAdressePharmacie() {
		return adressePharmacie;
	}

	public void setAdressePharmacie(String adressePharmacie) {
		this.adressePharmacie = adressePharmacie;
	}

	public String getVillePharmacie() {
		return villePharmacie;
	}

	public void setVillePharmacie(String villePharmacie) {
		this.villePharmacie = villePharmacie;
	}

	/*
	 * public Stock getStock() { return stock; }
	 * 
	 * public void setStock(Stock stock) { this.stock = stock; }
	 */

	
	



	/*
	 * public List<Pharmacien> getPharmaciens() { return pharmaciens; }
	 * 
	 * public void setPharmaciens(List<Pharmacien> pharmaciens) { this.pharmaciens =
	 * pharmaciens; }
	 */
}
