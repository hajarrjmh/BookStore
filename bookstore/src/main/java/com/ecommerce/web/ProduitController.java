package com.ecommerce.web;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.dao.*;
import com.ecommerce.entities.*;

@Controller
public class ProduitController {

	@Autowired
	private ProduitRepository produitRepository;
	
	@Autowired
	private AdminRepository adminRepository;
	
	@RequestMapping(value="/seConnecter", method=RequestMethod.POST)
	public String seConnecterPost(Model model, 
			@RequestParam(name="userName",  defaultValue="") String userName, 
			@RequestParam(name="password",  defaultValue="") String password) {
		Admin admin=adminRepository.findByUserName(userName);
		if( admin.getPassword().equals(password))
			return "acceuilAdmin";
		else return "seConnecter";
	}
	
	@RequestMapping(value="/seConnecter", method=RequestMethod.GET)
	public String seConnecterGet(Model model) {
			return "seConnecter";
	}
	
	/*@GetMapping("/acceuilAdmin")
	public String acceuilAdmin(Model model) {
		return "acceuilAdmin";
	}
	
	@GetMapping("/index")
	public String returnerProduits(Model model) {
		return "produits";
	}*/
}
