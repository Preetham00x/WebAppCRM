package com.telidu.WebbAppCRM.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.telidu.WebbAppCRM.model.Customer;
import com.telidu.WebbAppCRM.service.ICustomerService;

@Controller
public class CustomerController {
@Autowired
private ICustomerService service;
@GetMapping("/cx-info")
public String getCxdata(Model model) {
	List<Customer> customers=service.getCustomerInfo();
	model.addAttribute("customers",customers);
	customers.forEach(v->System.out.println(v));//debugging
	return "customerinfo";
	
}
}
