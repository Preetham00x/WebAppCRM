package com.telidu.WebbAppCRM.service;

import java.util.List;

import com.telidu.WebbAppCRM.model.Customer;

public interface ICustomerService {
	List<Customer> getCustomerInfo();
	void registerCustomer(Customer customer);
	Customer fetchCustomerById(Integer id);

}
