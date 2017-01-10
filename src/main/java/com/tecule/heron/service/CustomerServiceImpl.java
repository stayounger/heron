package com.tecule.heron.service;

import com.tecule.heron.model.Customer;
import com.tecule.heron.repository.CustomerRepository;
import com.tecule.heron.repository.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository = new CustomerRepositoryImpl();

	@Override
	public Customer create(String firstName, String lastName) {
		Customer customer = new Customer();
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		return customerRepository.save(customer);
	}
}
