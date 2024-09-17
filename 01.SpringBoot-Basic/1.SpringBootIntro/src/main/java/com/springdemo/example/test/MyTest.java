package com.springdemo.example.test;

import org.springframework.stereotype.Component;

@Component
public class MyTest {

	public MyTest() {
		System.out.println("MyTest::Constructor");
	}
	
	public void m1() {
		System.out.println("MyTest.m1()");
	}
	
}
