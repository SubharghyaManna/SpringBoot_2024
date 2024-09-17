package com.springproject.repo;

import com.springproject.model.Customer;

public interface ICustomerDAO {
	public int insert(Customer customer) throws Exception;
}
