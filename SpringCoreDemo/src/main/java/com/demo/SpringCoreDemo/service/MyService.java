package com.demo.SpringCoreDemo.service;

import com.demo.SpringCoreDemo.utility.EmailNotification;
import com.demo.SpringCoreDemo.utility.Notifications;
import com.demo.SpringCoreDemo.utility.SMSNotification;

public class MyService {
	
	/**
	 * MyService uses EmailNotification class
	 * HAS-A
	 * MyService is dependent on object of class EmailNotification
	 * Dependency Injection 
	 */
	Notifications notifications;
	public MyService() {
		System.out.println("MyService default constructor");
	}
	// fulfilled via constructor
	public MyService(Notifications notifications)
	{
		/**
		 * 1. hard-coded
		 * 2. not loosely coupled
		 * 3. not highly cohesiveness
		 * 
		 */
		//notifications = new EmailNotification();
		System.out.println("MyService parameterized constructor");
		this.notifications = notifications;
	}
	
	public Notifications getNotifications() {
		return notifications;
	}

	public void setNotifications(Notifications notifications) {
		this.notifications = notifications;
	}

	public void notifyCustomer()
	{
		notifications.sendNotification("Whatever the message is...");
		
	}

}
