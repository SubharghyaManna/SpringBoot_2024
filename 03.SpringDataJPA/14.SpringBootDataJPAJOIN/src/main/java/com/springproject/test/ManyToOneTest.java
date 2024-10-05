package com.springproject.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springproject.entity.Department;
import com.springproject.entity.Employee;
import com.springproject.repo.EmployeeRepo;

@Component
public class ManyToOneTest {

	@Autowired
	private EmployeeRepo repo;

	public void test() {

		Department department = new Department();
		department.setId(101);
		department.setName("SIT");

		Employee employee1 = new Employee();
		employee1.setId(101);
		employee1.setName("Robert");
		employee1.setDepartment(department);

		Employee employee2 = new Employee();
		employee2.setId(102);
		employee2.setName("Harrison");
		employee2.setDepartment(department);
		
		repo.saveAll(List.of(employee1, employee2));

	}

}
