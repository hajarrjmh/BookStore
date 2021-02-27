package com.ecommerce.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Admin")
public class Admin implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	@Column(name="admin_id")
  private Long idUser;
	@Column(name="admin_name")
  
  private String test;
  
  
  public String getTest() {
	return test;
}
public void setTest(String test) {
	this.test = test;
}
public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	
	
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

