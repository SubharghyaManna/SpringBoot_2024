package com.springrunner.apprunner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(12)
public class AppOrderedRunner implements ApplicationRunner, Ordered {

	@Override
	public int getOrder() {
		return -10;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("AppOrderedRunner.run():Order Value: " + this.getOrder());
	}

}
