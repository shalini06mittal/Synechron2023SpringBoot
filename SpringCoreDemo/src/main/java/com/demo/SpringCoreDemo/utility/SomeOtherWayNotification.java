package com.demo.SpringCoreDemo.utility;

// loosely coupled and highly cohesive
public class SomeOtherWayNotification implements Notifications{

	public void sendNotification(String message)
	{
		System.out.println("Sending "+ message);
		System.out.println("Through SOme other way");
		// all other things for brevity
	}
	
	
}
