package com.springproject.test;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@Setter
@ToString
@ConfigurationProperties(prefix = "jdbc")
@PropertySource("classpath:databaseconfig.properties")
public class ConfigurationTest {

	// PTD
//	private String driver;
//	private String url;
//	private String username;
//	private String password;

//	private Integer[] numbers;

	// CTD
//	private List<Integer> integers;
//	private Set<String> names;
//	private Map<String, Boolean> maps;

	// RTD
	private Config config;

}
