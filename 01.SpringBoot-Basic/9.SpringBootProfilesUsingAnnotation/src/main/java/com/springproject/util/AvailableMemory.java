package com.springproject.util;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("sit")
public class AvailableMemory {

	public AvailableMemory() {
		System.out.println("Checking available memory");
	}
}
