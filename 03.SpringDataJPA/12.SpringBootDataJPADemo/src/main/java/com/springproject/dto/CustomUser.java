package com.springproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomUser {

	private String firstName;
	private String lastName;
	private String email;
	private Integer age;

}
