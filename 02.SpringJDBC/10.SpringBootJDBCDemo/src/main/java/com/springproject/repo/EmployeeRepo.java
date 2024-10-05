package com.springproject.repo;

import java.util.List;

import com.springproject.entity.Employee;

public interface EmployeeRepo {

	public Employee save(Employee employee);

	public List<Employee> findAll();

	public List<Employee> findByEmpName(String name);

}
