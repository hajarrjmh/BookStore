package com.ecommerce.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long>  {

}
