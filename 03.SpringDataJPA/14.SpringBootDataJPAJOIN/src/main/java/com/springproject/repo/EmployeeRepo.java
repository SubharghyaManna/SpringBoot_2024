package com.springproject.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springproject.entity.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}
