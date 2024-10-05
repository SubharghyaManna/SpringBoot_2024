package com.springproject.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springproject.entity.Profile;
import com.springproject.entity.User;
import com.springproject.repo.UserRepo;

@Component
public class OneToOneTest {

	@Autowired
	private UserRepo repo;

	public void test() {
		User user = new User();
		Profile profile = new Profile();

		profile.setId(101);
		profile.setName("David Jones");
		profile.setAge(36.0);

		user.setUsername("david@123");
		user.setProfile(profile);

		repo.save(user);

	}

}
