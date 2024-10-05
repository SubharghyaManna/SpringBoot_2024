package com.springproject.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springproject.repo.UserDao;

@Component
public class FindByTest {

	@Autowired
	UserDao dao;

	public void test() {

		System.out.println(dao.findByFirstName("David"));

//		System.out.println(dao.findByFirstNameAndLastName("Jane", "Smith"));

//		System.out.println(dao.findByFirstNameOrLastName("Jane", "Jones"));

//		System.out.println(dao.findByAgeBetween(25, 30));

//		System.out.println(dao.findByAgeLessThanEqual(32));

//		System.out.println(dao.findByEmailLike("%brown%"));

//		dao.findByFirstNameOrderByLastNameDesc("David").forEach(System.out::println);

//		dao.findByFirstNameNot("David").forEach(System.out::println);

//		dao.findByFirstNameNull("David").forEach(System.out::println);

//		dao.findByFirstNameNull().forEach(System.out::println);

//		dao.findByDateOfBirthIsNotNull().forEach(System.out::println);

//		dao.findByActiveTrue().forEach(System.out::println);

//		dao.findByActiveFalse().forEach(System.out::println);

//		dao.getUniqueFirstName().forEach(System.out::println);

//		System.out.println(dao.m1("John"));

//		dao.m2().forEach(System.out::println);

//		dao.m3("Charlie").forEach(System.out::println);

//		dao.m4("example").forEach(System.out::println);

//		List<Object[]> userNames = dao.m5("example");
//		for (Object[] name : userNames) {
//			System.out.println("First Name: " + name[0] + " Last Name: " + name[1]);
//		}

	}

}
