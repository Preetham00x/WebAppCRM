package com.telidu.WebbAppCRM.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.telidu.WebbAppCRM.service.ICustomerService;

@Controller
public class CustomerController {
@Autowired
private ICustomerService service;
}
