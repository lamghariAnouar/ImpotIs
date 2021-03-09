package com.example.demo.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Facture implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int annee;
	private int mois;
	private double montantHt;
	private double montantTtc;
	private double montantTva;
	private String icesocieteSource;
	private String icesocieteDestination;
	private String Credit;
	private String Debit;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public int getMois() {
		return mois;
	}
	public void setMois(int mois) {
		this.mois = mois;
	}
	public double getMontantHt() {
		return montantHt;
	}
	public void setMontantHt(double montantHt) {
		this.montantHt = montantHt;
	}
	public double getMontantTtc() {
		return montantTtc;
	}
	public void setMontantTtc(double montantTtc) {
		this.montantTtc = montantTtc;
	}
	public double getMontantTva() {
		return montantTva;
	}
	public void setMontantTva(double montantTva) {
		this.montantTva = montantTva;
	}
	
	public String getIcesocieteSource() {
		return icesocieteSource;
	}
	public void setIcesocieteSource(String icesocieteSource) {
		this.icesocieteSource = icesocieteSource;
	}
	public String getIcesocieteDestination() {
		return icesocieteDestination;
	}
	public void setIcesocieteDestination(String icesocieteDestination) {
		this.icesocieteDestination = icesocieteDestination;
	}
	public String getCredit() {
		return Credit;
	}
	public void setCredit(String credit) {
		Credit = credit;
	}
	public String getDebit() {
		return Debit;
	}
	public void setDebit(String debit) {
		Debit = debit;
	}
	@Override
	public String toString() {
		return "Facture [id=" + id + ", annee=" + annee + ", mois=" + mois + ", montantHt=" + montantHt
				+ ", montantTtc=" + montantTtc + ", montantTva=" + montantTva + ", societeSource=" + icesocieteSource
				+ ", societeDestination=" + icesocieteDestination + ", Credit=" + Credit + ", Debit=" + Debit + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Facture other = (Facture) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
