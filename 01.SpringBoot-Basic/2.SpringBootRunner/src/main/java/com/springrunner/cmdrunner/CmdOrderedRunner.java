package com.springrunner.cmdrunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(-12)
public class CmdOrderedRunner implements CommandLineRunner, Ordered {

	@Override
	public int getOrder() {
		return 10;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CmdOrderedRunner.run():Order Value: " + this.getOrder());
	}

}
