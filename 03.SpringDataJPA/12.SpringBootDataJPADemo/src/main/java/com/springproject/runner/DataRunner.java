package com.springproject.runner;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.springproject.entity.User;
import com.springproject.repo.UserDao;

@Component
public class DataRunner implements ApplicationRunner {

	@Autowired
	UserDao dao;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		User[] users = new User[] {
				new User(1L, "David", "Jones", "david.jones@example.com", 30, LocalDate.of(1993, 5, 14), true),
				new User(2L, "Bob", "Johnson", "bob.johnson@example.com", 25, LocalDate.of(1998, 8, 22), true),
				new User(3L, "Charlie", "Brown", "charlie.brown@example.com", 35, LocalDate.of(1988, 2, 5), false),
				new User(4L, "Diana", "Prince", "diana.prince@example.com", 28, LocalDate.of(1995, 12, 1), true),
				new User(5L, "Edward", "Norton", "edward.norton@example.com", 40, LocalDate.of(1983, 11, 10), false),
				new User(6L, "Fiona", "Shrek", "fiona.shrek@example.com", 32, LocalDate.of(1991, 7, 20), true),
				new User(7L, "George", "Clooney", "george.clooney@example.com", 55, LocalDate.of(1968, 5, 6), true),
				new User(8L, "Hannah", "Montana", "hannah.montana@example.com", 22, LocalDate.of(2001, 3, 4), true),
				new User(9L, "Ian", "Fleming", "ian.fleming@example.com", 60, LocalDate.of(1963, 10, 12), false),
				new User(10L, "Jane", "Doe", "jane.doe@example.com", 27, LocalDate.of(1996, 6, 18), true) };

		dao.saveAll(Arrays.asList(users));

	}

}
