package com.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.entities.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
 
}
