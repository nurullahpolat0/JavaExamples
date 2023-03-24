package com.example.restfullservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.restfullservice.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	

}
