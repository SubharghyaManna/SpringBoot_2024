package com.springproject.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.springproject.config.DbConfig;

@Component
public class StartupRunner implements ApplicationRunner {

	@Autowired
	DbConfig config;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
//		System.out.println(args.getOptionNames());
//		System.out.println(args.getOptionValues("spring.output.ansi.enabled"));
		System.out.println(config);
	}

}
