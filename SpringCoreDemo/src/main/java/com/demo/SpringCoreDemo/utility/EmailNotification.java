package com.demo.SpringCoreDemo.utility;

import org.springframework.stereotype.Component;

// loosely coupled and highly cohesive
@Component
public class EmailNotification implements Notifications{

	
	public EmailNotification() {
		System.out.println("Email constructor");
	}
	public void sendNotification(String message)
	{
		System.out.println("Sending "+ message);
		System.out.println("Through Email");
		// all other things for brevity
	}
	
	
}
