package com.springproject.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.springproject.repo.UserSortingDao;

@Component
public class PagingSortingTest {

	@Autowired
	UserSortingDao dao;

	public void test() {

//		Sort sort = Sort.by(Direction.DESC, "firstName", "DateOfBirth");
//		Iterable<User> users = dao.findAll(sort);
//		users.forEach(System.out::println);

//		Order odr1 = Order.asc("firstName");
//		Order odr2 = Order.desc("age");
//		Iterable<User> users = dao.findAll(Sort.by(List.of(odr1, odr2)));
//		users.forEach(System.out::println);

//		dao.findAllByAge(22, Sort.by(Direction.DESC, "age")).forEach(System.out::println);

//		PageRequest page = PageRequest.ofSize(2);
//		Page<User> page1 = dao.findAll(page);
//		page1.get().forEach(System.out::println);
//		System.out.println("--------------------------");
//		
//		Pageable nextPageable = page1.nextPageable();
//		Page<User> page2 = dao.findAll(nextPageable);
//		page2.get().forEach(System.out::println);

//		PageRequest firstPageWithTwoRecord = PageRequest.of(0, 2);
//		PageRequest secondPageWithTwoRecords = PageRequest.of(1, 2);
//		
//		System.out.println("--------Page 1----------");
//		dao.findAll(firstPageWithTwoRecord).get().forEach(System.out::println);
//
//		System.out.println("--------Page 2----------");
//		dao.findAll(secondPageWithTwoRecords).get().forEach(System.out::println);

		dao.findAllByAge(22, PageRequest.of(0, 2, Direction.DESC, "Age")).forEach(System.out::println);
	}

}
