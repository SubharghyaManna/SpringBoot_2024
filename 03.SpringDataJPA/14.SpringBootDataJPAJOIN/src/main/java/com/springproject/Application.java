package com.springproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springproject.test.ManyToManyTest;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
//		run.getBean(ManyToOneTest.class).test();
//		run.getBean(OneToManyTest.class).test();
		run.getBean(ManyToManyTest.class).test();
	}

}
