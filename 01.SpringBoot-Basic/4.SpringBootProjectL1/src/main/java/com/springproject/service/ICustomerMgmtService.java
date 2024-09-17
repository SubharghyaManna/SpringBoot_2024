package com.springproject.service;

import com.springproject.model.Customer;

public interface ICustomerMgmtService {
	public String registerCustomer(Customer customer, Integer rate, Integer time) throws Exception;
}
