package com.springrunner.apprunner;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class AppRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Non-Option Arguments:         " + args.getNonOptionArgs());
		System.out.println("Keys of the Option Arguments: " + args.getOptionNames());
		System.out.println("'key1' is available?:         " + args.containsOption("key1"));
		System.out.println("'key1' value:                 " + args.getOptionValues("key1"));
		System.out.println("All arguments:                " + Arrays.toString(args.getSourceArgs()));
	}

}
