package com.springproject.test;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springproject.entity.Department;
import com.springproject.repo.DepartmentRepo;

@Component
public class OneToManyTest {

	@Autowired
	private DepartmentRepo repo;

	public void test() {

//		Employee employee1 = new Employee();
//		employee1.setId(101);
//		employee1.setName("Robert");
//
//		Employee employee2 = new Employee();
//		employee2.setId(102);
//		employee2.setName("Harrison");
//
//		Department department = new Department();
//		department.setEmployees(List.of(employee1, employee2));
//
//		repo.save(department);

		Optional<Department> dept = repo.findById(101);
		if (dept.isPresent()) {
			dept.get().getEmployees().forEach((emp) -> System.out.println(emp.getName()));
		}

	}

}
