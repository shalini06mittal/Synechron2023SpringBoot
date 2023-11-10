package com.demo.SpringCoreDemo.utility;

// loosely coupled and highly cohesive
public class EmailNotification implements Notifications{

	public void sendNotification(String message)
	{
		System.out.println("Sending "+ message);
		System.out.println("Through Email");
		// all other things for brevity
	}
	
	
}
