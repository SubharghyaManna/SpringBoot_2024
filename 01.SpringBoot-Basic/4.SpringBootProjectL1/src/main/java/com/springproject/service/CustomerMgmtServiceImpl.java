package com.springproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.model.Customer;
import com.springproject.repo.ICustomerDAO;

@Service
public class CustomerMgmtServiceImpl implements ICustomerMgmtService {

	@Autowired
	private ICustomerDAO dao;

	@Override
	public String registerCustomer(Customer customer, Integer rate, Integer time) throws Exception {
		// business logic
		double intrmt = customer.getPamt() * rate * time / 100.0;

		// create BO object
		Customer cust = new Customer();
		cust.setCname(customer.getCname());
		cust.setCaddr(customer.getCaddr());
		cust.setPamt(customer.getPamt());
		cust.setIntramt(intrmt);

		// use DAO
		int count = dao.insert(cust);

		return count == 0 ? "Registration Failed" : "Registration Success";
	}

}
