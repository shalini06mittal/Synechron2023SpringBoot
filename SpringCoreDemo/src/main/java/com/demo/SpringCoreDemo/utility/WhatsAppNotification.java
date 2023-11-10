package com.demo.SpringCoreDemo.utility;

public class WhatsAppNotification implements Notifications{

	public void sendNotification(String message)
	{
		System.out.println("Sending "+ message);
		System.out.println("Through WhatsApp");
		// all other things for brevity
	}
	
}
