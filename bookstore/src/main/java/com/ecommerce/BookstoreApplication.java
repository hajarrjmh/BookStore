package com.ecommerce;

import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ecommerce.dao.*;
import com.ecommerce.entities.*;
@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner{
	/*
	@Autowired
	private ProduitRepository produitRepository;
	
	@Autowired
	private CategorieRepository categorieRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private CommandeRepository commandeRepository;
	
	@Autowired
	private LignePanierRepository lignePanierRepository;
	
	@Autowired
	private PaiementRepository paiementRepository;
	
	@Autowired
	private AdminRepository adminRepository;*/
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*categorieRepository.save(new Categorie("nomCategorie1"));
		categorieRepository.save(new Categorie("nomCategorie2"));
		categorieRepository.save(new Categorie("nomCategorie3"));
		categorieRepository.save(new Categorie("nomCategorie4"));
	
		Produit p1=new Produit("designation1",  14,"photo1", 13);
		//p1.setCategorie(null);
		produitRepository.save(p1);
		produitRepository.save(new Produit("designation2",  14,"photo2", 13));
		produitRepository.save(new Produit("designation3",  14,"photo3", 13));
		produitRepository.save(new Produit("designation4",  14,"photo4", 13));
		//produitRepository.findAll().forEach(p->{System.out.println(p.getDesignation());});
		
		clientRepository.save(new Client("nomClient1","adresse1", "email1","password1","tel1",paiementRepository.getOne(new Long(1))));
		clientRepository.save(new Client("nomClient2","adresse2", "email2","password2","tel2",paiementRepository.getOne(new Long(2))));
		clientRepository.save(new Client("nomClient3","adresse3", "email3","password3","tel3",paiementRepository.getOne(new Long(3))));
		clientRepository.save(new Client("nomClient4","adresse4", "email4","password4","tel4",paiementRepository.getOne(new Long(4))));
		clientRepository.save(new Client("nomClient5","adresse5", "email5","password5","tel5",paiementRepository.getOne(new Long(5))));*/
		
		
		//clientRepository.findAll().forEach(p->{System.out.println(p.getNom());});
		
		/*
		commandeRepository.save(new Commande(new Date(),clientRepository.getOne(new Long(2))));
		commandeRepository.save(new Commande(new Date(),clientRepository.getOne(new Long(3))));
		
		lignePanierRepository.save(new LignePanier(produitRepository.getOne(new Long(1)), 14, 150,commandeRepository.getOne(new Long(1))));
		lignePanierRepository.save(new LignePanier(produitRepository.getOne(new Long(2)), 14, 150,commandeRepository.getOne(new Long(2))));
		lignePanierRepository.save(new LignePanier(produitRepository.getOne(new Long(3)), 14, 150,commandeRepository.getOne(new Long(1))));
		lignePanierRepository.save(new LignePanier(produitRepository.getOne(new Long(4)), 14, 150,commandeRepository.getOne(new Long(2))));
		
		adminRepository.save(new Admin("userName1", "password1"));
		adminRepository.save(new Admin("userName2", "password2"));
		adminRepository.save(new Admin("userName3", "password3"));
		adminRepository.save(new Admin("userName4", "password4"));
		adminRepository.save(new Admin("userName5", "password5"));
	
		paiementRepository.save(new Paiement("nomTitulaire1", "1712", 25, new Date()));
		paiementRepository.save(new Paiement("nomTitulaire2", "14712", 425, new Date()));
		paiementRepository.save(new Paiement("nomTitulaire3", "14712", 25, new Date()));
		paiementRepository.save(new Paiement("nomTitulaire4", "14712",5,new Date()));*/
		
		
	}

}
