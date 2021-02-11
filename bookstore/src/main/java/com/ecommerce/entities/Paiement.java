package com.ecommerce.entities;



import java.io.Serializable;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class Paiement implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPaiement ;
	private String nomTitulaire;
	private String numCarte;
	private int codeCVV ;
	private Date dateExpiration;
	
	public Long getIdPaiement() {
		return idPaiement;
	}
	public void setIdPaiement(Long idPaiement) {
		this.idPaiement = idPaiement;
	}
	public String getNomTitulaire() {
		return nomTitulaire;
	}
	public void setNomTitulaire(String nomTitulaire) {
		this.nomTitulaire = nomTitulaire;
	}
	public String getNumCarte() {
		return numCarte;
	}
	public void setNumCarte(String numCarte) {
		this.numCarte = numCarte;
	}
	public int getCodeCVV() {
		return codeCVV;
	}
	public void setCodeCVV(int codeCVV) {
		this.codeCVV = codeCVV;
	}
	public Date getDateExpiration() {
		return dateExpiration;
	}
	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
	public Paiement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Paiement(String nomTitulaire, String numCarte, int codeCVV, Date dateExpiration) {
		super();
		this.nomTitulaire = nomTitulaire;
		this.numCarte = numCarte;
		this.codeCVV = codeCVV;
		this.dateExpiration = dateExpiration;
	}
	
	

}
