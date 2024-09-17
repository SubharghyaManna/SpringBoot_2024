package com.springproject.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.springproject.storage.AccessStorage;

@Configuration
public class DatabaseWriteAccess {

	@Bean
	@Profile({"dev", "pilot"})
	AccessStorage getAccessStorage() {
		System.out.println("Database Write Access is required");
		return new AccessStorage(true, "Mumbai");
	}
}
