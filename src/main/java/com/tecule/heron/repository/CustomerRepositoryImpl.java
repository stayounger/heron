package com.tecule.heron.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tecule.heron.model.Customer;

public class CustomerRepositoryImpl implements CustomerRepository {

	@Override
	public Customer save(Customer customer) {
		/*
		 * the persistenceUnitName parameter is defined in the persistence.xml. an EntityManagerFactory is set up once
		 * for an application
		 */
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.tecule.heron.pu");

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(customer);
		entityManager.getTransaction().commit();
		entityManager.close();

		entityManagerFactory.close();

		return customer;
	}

}
