package com.example.restfullservice.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.restfullservice.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	Customer customer;

	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customer> getAllCustomer() {
		
		customer = new Customer(2,"nurullah",27);
		List<Customer> customerList = new LinkedList<Customer>();
		customerList.add(customer);
		return customerList;
	}

}
