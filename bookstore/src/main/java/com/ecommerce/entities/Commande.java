package com.ecommerce.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Commande implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long idCommande;
  private Date dateCommande;
  @OneToMany(mappedBy="commande")
  private Collection<LignePanier> items;
  
  @ManyToOne
  @JoinColumn(name="idClient")
  private Client client;
public Long getIdCommande() {
	return idCommande;
}
public void setIdCommande(Long idCommande) {
	this.idCommande = idCommande;
}
public Date getDateCommande() {
	return dateCommande;
}
public void setDateCommande(Date dateCommande) {
	this.dateCommande = dateCommande;
}


public Client getClient() {
	return client;
}
public void setClient(Client client) {
	this.client = client;
}
public Commande() {
	super();
	// TODO Auto-generated constructor stub
}
  
  
}

