package com.example.restfullservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restfullservice.model.Customer;
import com.example.restfullservice.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	Customer customer;
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public void saveCustomer(Customer customer) {
		
		customerRepository.save(customer);
		
	}

	@Override
	public List<Customer> getAllCustomer() {
		
		return customerRepository.findAll();
	}

}
