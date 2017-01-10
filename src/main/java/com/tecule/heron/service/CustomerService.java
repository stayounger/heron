package com.tecule.heron.service;

import com.tecule.heron.model.Customer;

public interface CustomerService {
	public Customer create(String firstName, String lastName);
}
