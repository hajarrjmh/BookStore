package com.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.entities.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
	public Paiement findByNomTitulaire(String nomTitumaire);
}
