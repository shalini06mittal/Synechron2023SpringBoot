package com.demo.SpringCoreDemo;

import com.demo.SpringCoreDemo.service.MyService;
import com.demo.SpringCoreDemo.utility.EmailNotification;
import com.demo.SpringCoreDemo.utility.SMSNotification;
/**
 * 1. DI
 * 2. AOP => common functionalities across applications are taken care by AOP
 * logging
 * transaction management
 * security
 * Aspect Oriented Programming
 * 3. HAL => Hardware  abstraction layer
 * JdbcTemplate -> abstraction over JDBC API
 * @author Shalini
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/**
    	 * 1. object creation
    	 * 2. Dependency injection management
    	 * 3. memory allocation and deallocation
    	 * 
    	 * to take the control over
    	 * Inversion of control
    	 * spring framework
    	 */
    	EmailNotification email = new EmailNotification();
    	SMSNotification sms = new SMSNotification();
        //MyService s1= new MyService(sms);
    	MyService s1 = new MyService();
    	s1.setNotifications(sms);
        s1.notifyCustomer();
        email = null;
        
        // tell spring which class object you need
        MyService s2; // get me MyService object and also inject dependency
        //s2.notifyCustomer();
    }
}
