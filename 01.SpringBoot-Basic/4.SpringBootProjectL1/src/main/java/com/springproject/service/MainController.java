package com.springproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springproject.model.Customer;

@Controller
public class MainController {

	@Autowired
	private ICustomerMgmtService service;

	public String processCustomer(Customer customer, Integer rate, Integer time) throws Exception {
		return service.registerCustomer(customer, rate, time);
	}

}
