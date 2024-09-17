package com.springproject.util;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class SendNotification {

	public SendNotification() {
		System.out.println("You got the notification");
	}
}
