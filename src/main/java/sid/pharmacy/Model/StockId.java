package sid.pharmacy.Model;

import java.io.Serializable;
import javax.persistence.Embeddable;

public class StockId implements Serializable {

	private static final long serialVersionUID = 1L;

	
	private String nomPharmacie;
	
	
	private String nomProduit;
	
	
	
	public StockId() {
		
	}
	
	

	public String getNomPharmacie() {
		return nomPharmacie;
	}



	public void setNomPharmacie(String nomPharmacie) {
		this.nomPharmacie = nomPharmacie;
	}



	public String getNomProduit() {
		return nomProduit;
	}



	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomPharmacie == null) ? 0 : nomPharmacie.hashCode());
		result = prime * result + ((nomProduit == null) ? 0 : nomProduit.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StockId other = (StockId) obj;
		if (nomPharmacie == null) {
			if (other.nomPharmacie != null)
				return false;
		} else if (!nomPharmacie.equals(other.nomPharmacie))
			return false;
		if (nomProduit == null) {
			if (other.nomProduit != null)
				return false;
		} else if (!nomProduit.equals(other.nomProduit))
			return false;
		return true;
	}
	
	
	
	
	
	
	/*
	 * @Override public boolean equals(Object o) { if(this == o) return true; if(!(o
	 * instanceof StockId)) return false; StockId that = (StockId) o; return
	 * Objects.equals(getPharmacie(), that.getPharmacie()) &&
	 * Objects.equals(getProduit(), that.getProduit()); }
	 * 
	 * @Override public int hashCode() { return Objects.hash(getPharmacie(),
	 * getProduit()); }
	 */
}
