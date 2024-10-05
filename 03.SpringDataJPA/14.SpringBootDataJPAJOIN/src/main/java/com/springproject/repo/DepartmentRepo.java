package com.springproject.repo;

import org.springframework.data.repository.CrudRepository;

import com.springproject.entity.Department;

public interface DepartmentRepo extends CrudRepository<Department, Integer> {

}
