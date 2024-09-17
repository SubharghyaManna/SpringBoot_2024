package com.springproject.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@Setter
@ToString
@ConfigurationProperties("my.app")
public class DbConfig {

	private String name;
	private String role;

}
