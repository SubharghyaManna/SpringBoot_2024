package com.springproject;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springproject.entity.Employee;
import com.springproject.repo.EmployeeRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(Application.class, args);

		EmployeeRepo repo = ac.getBean(EmployeeRepo.class);

//		Scanner sc = new Scanner(System.in);
//		for(int i=0; i<5; i++) {
//			System.out.print("Enter id: ");
//			int id = sc.nextInt();
//
//			System.out.print("Enter name: ");
//			String name = sc.next();
//
//			System.out.print("Enter salary: ");
//			double sal = sc.nextDouble();
//
//			Employee employee = new Employee();
//			employee.setEmpId(id);
//			employee.setEmpName(name);
//			employee.setEmpSal(sal);
//
//			Employee emp = repo.save(employee);
//			if (emp == null) {
//				System.out.println("Failed");
//			} else {
//				System.out.println("Added");
//			}
//		}

		List<Employee> all = repo.getAll();
		System.out.println("\n-----PRINTING ALL RECORDS-----");
		for (Employee e : all) {
			System.out.println(e);
		}

//		repo.getAll().forEach(System.out::println);

	}

}
