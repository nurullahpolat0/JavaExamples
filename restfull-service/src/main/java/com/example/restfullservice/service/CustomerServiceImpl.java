package com.example.restfullservice.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.restfullservice.dto.CustomerDto;
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
	
	private ModelMapper modelMapper;
	
	public CustomerServiceImpl(CustomerRepository customerRepository, ModelMapper modelMapper) {
		this.customerRepository = customerRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public void saveCustomer(CustomerDto customerDto) {
		
		Customer customer = modelMapper.map(customerDto, Customer.class);
		customerRepository.save(customer);
		
	}

	@Override
	public List<CustomerDto> getAllCustomer() {
		
		List<Customer> customers = customerRepository.findAll();
		
		return customers.stream().map((customer) -> modelMapper.map(customer, CustomerDto.class))
                .collect(Collectors.toList());
	}

	@Override
	public void deleteCustomerById(int id) {
		
		customerRepository.deleteById(id);
	}


	@Override
	public CustomerDto findCustomerById(int id) {
		Optional<Customer> optionalCustomer = customerRepository.findById(id);
		CustomerDto customerDto = modelMapper.map(optionalCustomer, CustomerDto.class);
		return customerDto;
	}


}
