package com.ecommerce.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {

	public Admin findByUserName(String userName);
}
