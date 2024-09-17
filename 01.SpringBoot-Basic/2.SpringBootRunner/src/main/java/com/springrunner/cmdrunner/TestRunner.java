package com.springrunner.cmdrunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(-100)

public class TestRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("TestRunner.run()");
	}

}
