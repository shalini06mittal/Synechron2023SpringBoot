package com.demo.SpringJdbcDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.demo.SpringJdbcDemo.database.EmpDatabase;
import com.demo.SpringJdbcDemo.entity.Emp;

/**
 * Hello world!
 *SOC -> separation of concerns
 */
@Configuration
@ComponentScan
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
       EmpDatabase db = context.getBean(EmpDatabase.class);
       System.out.println(db.count());
//       Emp e1 = new Emp(3, "Radhika", "Bengaluru");
//       db.insertEmp(e1);
       System.out.println(db.getEmpById(1));
    }
}
