package com.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
