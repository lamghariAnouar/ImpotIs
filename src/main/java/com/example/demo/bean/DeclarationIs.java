package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class DeclarationIs {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String ref;
private String iceSociete;
private double chiffreAffaire;
private double charges;
private double resultatFiscale;
private double montantBase;

public String getRef() {
	return ref;
}
public void setRef(String ref) {
	this.ref = ref;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getIceSociete() {
	return iceSociete;
}
public void setIceSociete(String iceSociete) {
	this.iceSociete = iceSociete;
}
public double getChiffreAffaire() {
	return chiffreAffaire;
}
public void setChiffreAffaire(double chiffreAffaire) {
	this.chiffreAffaire = chiffreAffaire;
}
public double getCharges() {
	return charges;
}
public void setCharges(double charges) {
	this.charges = charges;
}
public double getResultatFiscale() {
	return resultatFiscale;
}
public void setResultatFiscale(double resultatFiscale) {
	this.resultatFiscale = resultatFiscale;
}
public double getMontantBase() {
	return montantBase;
}
public void setMontantBase(double montantBase) {
	this.montantBase = montantBase;
}

}
