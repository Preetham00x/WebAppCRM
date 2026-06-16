package com.telidu.WebbAppCRM.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.telidu.WebbAppCRM.model.Customer;

@Repository
public interface ICustomerRepo extends CrudRepository<Customer, Integer> {
	

}
