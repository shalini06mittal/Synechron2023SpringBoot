package com.demo.SpringCoreDemo;

import com.demo.SpringCoreDemo.service.MyService;

public class App 
{
    public static void main( String[] args )
    {
        MyService s1= new MyService();
        s1.notifyCustomer();
    }
}
