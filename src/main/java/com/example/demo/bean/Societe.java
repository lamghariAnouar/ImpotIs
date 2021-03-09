package com.example.demo.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Societe implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String ice;
	private String siegeSociale;
	@ManyToOne
	private TypeSociete typeSociete;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIce() {
		return ice;
	}
	public void setIce(String ice) {
		this.ice = ice;
	}
	public String getSiegeSociale() {
		return siegeSociale;
	}
	public void setSiegeSociale(String siegeSociale) {
		this.siegeSociale = siegeSociale;
	}
	public TypeSociete getTypeSociete() {
		return typeSociete;
	}
	public void setTypeSociete(TypeSociete typeSociete) {
		this.typeSociete = typeSociete;
	}
	@Override
	public String toString() {
		return "Societe [id=" + id + ", ice=" + ice + ", siegeSociale=" + siegeSociale + ", typeSociete=" + typeSociete
				+ "]";
	}
	public Societe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Societe(Long id, String ice, String siegeSociale, TypeSociete typeSociete) {
		super();
		this.id = id;
		this.ice = ice;
		this.siegeSociale = siegeSociale;
		this.typeSociete = typeSociete;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ice == null) ? 0 : ice.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((siegeSociale == null) ? 0 : siegeSociale.hashCode());
		result = prime * result + ((typeSociete == null) ? 0 : typeSociete.hashCode());
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
		Societe other = (Societe) obj;
		if (ice == null) {
			if (other.ice != null)
				return false;
		} else if (!ice.equals(other.ice))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (siegeSociale == null) {
			if (other.siegeSociale != null)
				return false;
		} else if (!siegeSociale.equals(other.siegeSociale))
			return false;
		if (typeSociete == null) {
			if (other.typeSociete != null)
				return false;
		} else if (!typeSociete.equals(other.typeSociete))
			return false;
		return true;
	}
	
	
}
