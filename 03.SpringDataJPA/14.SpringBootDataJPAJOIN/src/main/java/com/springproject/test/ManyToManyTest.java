package com.springproject.test;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springproject.entity.Course;
import com.springproject.entity.Student;
import com.springproject.repo.StudentRepo;

@Component
public class ManyToManyTest {

	@Autowired
	private StudentRepo repo;

	public void test() {
		Course course1 = new Course();
		course1.setId(1001L);
		course1.setName("Core Java");

		Course course2 = new Course();
		course2.setId(1002L);
		course2.setName("Advanced Java");

		Student student = new Student();
		student.setName("Anya");
		student.setCourses(Set.of(course1, course2));

//		course1.setStudents(Set.of(student));

		repo.save(student);

	}

}
