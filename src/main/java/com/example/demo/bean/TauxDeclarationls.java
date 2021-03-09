package com.example.demo.bean;



import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class TauxDeclarationls implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Double resultatFiscalMn;
	private Double resultatFiscalMx;
	private Double pourcentage;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		id = id;
	}
	public Double getResultatFiscalMn() {
		return resultatFiscalMn;
	}
	public void setResultatFiscalMn(Double resultatFiscalMn) {
		this.resultatFiscalMn = resultatFiscalMn;
	}
	public Double getResultatFiscalMx() {
		return resultatFiscalMx;
	}
	public void setResultatFiscalMx(Double resultatFiscalMx) {
		this.resultatFiscalMx = resultatFiscalMx;
	}
	public Double getPourcentage() {
		return pourcentage;
	}
	public void setPourcentage(Double pourcentage) {
		this.pourcentage = pourcentage;
	}
	@Override
	public String toString() {
		return "TauxDeclarationls [id=" + id + ", resultatFiscalMin=" + resultatFiscalMn + ", resultatFiscalMax="
				+ resultatFiscalMx + ", pourcentage=" + pourcentage + "]";
	}
	public TauxDeclarationls() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TauxDeclarationls(Long id, Double resultatFiscalMn, Double resultatFiscalMx, Double pourcentage) {
		super();
		id = id;
		this.resultatFiscalMn = resultatFiscalMn;
		this.resultatFiscalMx = resultatFiscalMx;
		this.pourcentage = pourcentage;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((pourcentage == null) ? 0 : pourcentage.hashCode());
		result = prime * result + ((resultatFiscalMx == null) ? 0 : resultatFiscalMx.hashCode());
		result = prime * result + ((resultatFiscalMn == null) ? 0 : resultatFiscalMn.hashCode());
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
		TauxDeclarationls other = (TauxDeclarationls) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (pourcentage == null) {
			if (other.pourcentage != null)
				return false;
		} else if (!pourcentage.equals(other.pourcentage))
			return false;
		if (resultatFiscalMx == null) {
			if (other.resultatFiscalMx != null)
				return false;
		} else if (!resultatFiscalMx.equals(other.resultatFiscalMx))
			return false;
		if (resultatFiscalMn == null) {
			if (other.resultatFiscalMn != null)
				return false;
		} else if (!resultatFiscalMn.equals(other.resultatFiscalMn))
			return false;
		return true;
	}
	
	

}