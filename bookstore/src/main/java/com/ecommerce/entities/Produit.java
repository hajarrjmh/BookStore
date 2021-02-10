package com.ecommerce.entities;



import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="produits")
public class Produit implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long idProduit;
	
  private String designation;
  private double prix;
  private String photo;
  private int quantite;
  @ManyToOne
  @JoinColumn(name="idCategorie")
  private Categorie categorie;
  
public Long getIdProduit() {
	return idProduit;
}
public void setIdProduit(Long idProduit) {
	this.idProduit = idProduit;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}




public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}

public String getPhoto() {
	return photo;
}
public void setPhoto(String photo) {
	this.photo = photo;
}
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
public Categorie getCategorie() {
	return categorie;
}
public void setCategorie(Categorie categorie) {
	this.categorie = categorie;
}


public Produit() {
	super();
	// TODO Auto-generated constructor stub
}
/*public Produit(String designation,  double prix, String photo, int quantite) {
	super();
	this.designation = designation;
	
	this.prix = prix;
	
	this.photo = photo;
	this.quantite = quantite;
}*/
public Produit(String designation, double prix, String photo, int quantite, Categorie categorie) {
	super();
	this.designation = designation;
	this.prix = prix;
	this.photo = photo;
	this.quantite = quantite;
	this.categorie = categorie;
}

  
  
}

