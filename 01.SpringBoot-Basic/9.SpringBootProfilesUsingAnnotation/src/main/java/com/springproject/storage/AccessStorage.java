package com.springproject.storage;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccessStorage {

	private Boolean writeAccess;
	private String region;

}
