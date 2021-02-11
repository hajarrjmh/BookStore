package com.ecommerce.web;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.dao.PaiementRepository;
import com.ecommerce.entities.Client;
import com.ecommerce.entities.Paiement;

@Controller
public class PaiementController {
	@Autowired
	private PaiementRepository paiementRepository;

	@RequestMapping(value="/enregistrerPaiement", method=RequestMethod.POST)
	public String enregistrerPaiementPost(Model model,
			@RequestParam(name="nomTitulaire",  defaultValue="") String nomTitulaire, 
			@RequestParam(name="numCarte",  defaultValue="") String numCarte,
			@RequestParam(name="codeCVV") int codeCvv,
			@RequestParam(name="dateExpiration") @DateTimeFormat(pattern="yyyy-MM-dd") Date dateExpiration) {
			paiementRepository.save(new Paiement(nomTitulaire,numCarte,codeCvv,dateExpiration));
				return "Paiement";
		
	}
	
	@RequestMapping(value="/enregistrerPaiement", method=RequestMethod.GET)
	public String enregistrerPaiementGet(Model model) {
				return "Paiement";
		
	}
	
}
