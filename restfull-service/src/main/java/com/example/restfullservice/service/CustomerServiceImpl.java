package com.example.restfullservice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.restfullservice.model.Customer;
import com.example.restfullservice.repository.CustomerRepository;

/**
 * 
 * @author Nurullah Polat
 *
 *This class is implemention of CustomerService interface
 *
 */

@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	private final CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public void saveCustomer(Customer customer) {
		
		customerRepository.save(customer);
		
	}

	@Override
	public List<Customer> getAllCustomer() {
		
		return customerRepository.findAll();
	}

	@Override
	public void deleteCustomerById(int id) {
		
		customerRepository.deleteById(id);
	}

}
