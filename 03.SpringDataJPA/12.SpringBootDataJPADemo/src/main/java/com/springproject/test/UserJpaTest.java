package com.springproject.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Component;

import com.springproject.entity.User;
import com.springproject.repo.UserJpaDao;

@Component
public class UserJpaTest {

	@Autowired
	UserJpaDao dao;

	public void test() {

		// QBEExecutor Demo

		User probe = new User();
		probe.setFirstName("daViD");
		probe.setEmail("david.jones@example.com");

//		List<User> users = dao.findAll(Example.of(probe));
//		users.forEach(System.out::println);

//		Optional<User> user = dao.findOne(Example.of(probe));
//		if (user.isPresent()) {
//			System.out.println(user.get());
//		} else {
//			System.out.println("NA");
//		}

		ExampleMatcher matcher = ExampleMatcher.matching()//
				.withMatcher("firstName", ExampleMatcher.GenericPropertyMatchers.caseSensitive());
		Iterable<User> users = dao.findAll(Example.of(probe, matcher));
		users.forEach(System.out::println);

//		Optional<User> opUser = dao.findById(Long.valueOf(6));
//		if (opUser.isPresent()) {
//			System.out.println(opUser.get());
//		} else {
//			System.out.println("NA");
//		}

		// JPA Demo
//		User user = dao.getReferenceById(Long.valueOf(6));
//		System.out.println(user);

//		Optional<User> opUser = dao.findById(user.getId());
//		if (opUser.isPresent()) {
//			System.out.println(opUser.get());
//		} else {
//			System.out.println("NA");
//		}

//		System.out.println(user.getId());
		
	}

}
