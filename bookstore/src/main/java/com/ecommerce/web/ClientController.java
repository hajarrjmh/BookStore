package com.ecommerce.web;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.dao.*;
import com.ecommerce.entities.*;

@Controller
public class ClientController {
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private PaiementRepository paiementRepository;
	
	
	@RequestMapping(value="/seConnecterClient", method=RequestMethod.POST)
	public String seConnecterPost(Model model,
			@RequestParam(name="email",  defaultValue="") String email, 
			@RequestParam(name="password",  defaultValue="") String password) {
		String verifier="email ou password incorrect";
		model.addAttribute("verifier", verifier);
		Client client=clientRepository.findByEmail(email);
		if( client.getPassword().equals(password)) {
			return "Acceuil";
		}
			
		else {
			
			return "seConnecterClient";
		}
	}
	
	@RequestMapping(value="/seConnecterClient", method=RequestMethod.GET)
	public String seConnecterGet(Model model) {
			return "seConnecterClient";
	}
	
	
	@RequestMapping(value="/infoClient", method=RequestMethod.GET)
	public String infoClient(Model model,
			@RequestParam(name="nomClient",  defaultValue="") String nomClient) {
		//if(!nomTitulaire.equals(""));
			Client client=clientRepository.findByNomClient(nomClient);
			model.addAttribute("client", client);
			
			Paiement paiement=paiementRepository.findByNomTitulaire(client.getPaiement().getNomTitulaire());
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			
			String date=dateFormat.format(paiement.getDateExpiration());
			model.addAttribute("date",date);
			model.addAttribute("paiement", paiement);
		return "InfoClient";
		
	}

}
