package com.ecommerce.dao;

import com.ecommerce.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long>  {

	public Client findByEmail(String email);
	public Client findByNomClient(String nomClient);
}
