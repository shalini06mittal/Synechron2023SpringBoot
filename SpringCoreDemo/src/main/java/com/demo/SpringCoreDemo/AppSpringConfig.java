package com.demo.SpringCoreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.demo.SpringCoreDemo.service.MyService;
import com.demo.SpringCoreDemo.utility.EmailNotification;
import com.demo.SpringCoreDemo.utility.SMSNotification;
import com.payment.PaymentProject.PaymentService;

// annotation based configuration
@Configuration
// where the classes are located for spring to load and instantiate them 
// scan which classes/components/beans to load and instantiate
@ComponentScan //(basePackages = {"basic","com.demo.SpringCoreDemo"}) // look for all the classes in the
// follow the package convention and the package structure
// all the classes and packages within the root package are automatically scanned
public class AppSpringConfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ApplicationContext context = //
		System.out.println("main starts");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppSpringConfig.class);
		//EmailNotification email;
		MyService myService = context.getBean(MyService.class);
		//SMSNotification sms = new SMSNotification();
		System.out.println();
		for(String beanname: context.getBeanDefinitionNames())
			System.out.println(beanname);
		System.out.println();
		myService.notifyCustomer();
		
	}
	@Bean // method level annotation and Spring managend bean 
	public PaymentService initPaymentService()
	{
		System.out.println("Payment service object created");
		return new PaymentService();
	}

}
