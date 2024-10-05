package com.springproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springproject.test.FindByTest;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		context.getBean(FindByTest.class).test();
		
//		StudentDao dao = context.getBean(StudentDao.class);
//		System.out.println(dao);

		/*Student student1 = new Student();
		student1.setRollNo(101);
		student1.setName("Robert");
		student1.setMarks(8.31);

		Student student2 = new Student();
		student2.setRollNo(103);
		student2.setName("Harisson");
		student2.setMarks(8.11);

//		List<Student> students = new ArrayList<>();
//		students.add(student1);
//		students.add(student2);

		dao.saveAll(Arrays.asList(student1, student2));*/
		
		/*Optional<Student> student = dao.findById(999);
		if (student.isPresent()) {
			System.out.println(student.get());
		} else {
			System.out.println("NA");
		}*/
		
		/*Iterable<Student> students = dao.findAll();
//		for (Student s : students) {
//			System.out.println(s);
//		}
		students.forEach(System.out::println);*/
		
		
		/*Iterable<Student> students = dao.findAllById(Arrays.asList(101, 103));
		students.forEach(System.out::println);*/
		
		/*System.out.println(dao.existsById(101));
		System.out.println(dao.existsById(999));*/
		
		/*System.out.println(dao.count());*/

		/*Student student = new Student();
		student.setRollNo(100);
		student.setName("David");
		student.setMarks(9.94);
		dao.delete(student);*/
		
		
		/*dao.deleteAllById(Arrays.asList(101, 102, 999));*/
		
		/*Student student1 = new Student();
		student1.setRollNo(101);
		student1.setName("Robert");
		student1.setMarks(8.31);

		Student student2 = new Student();
		student2.setRollNo(103);
		student2.setName("Harisson");
		student2.setMarks(8.11);
		
		Student student3 = new Student();
		student3.setRollNo(999);
		student3.setName("Phillip");
		student3.setMarks(7.54);
		
		dao.deleteAll(Arrays.asList(student1, student2, student3));*/
		
		// TRUNCATE TABLE student;
//		dao.deleteAll();
		
	}

}
