package com.threads;

public class Test {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()); // main
		MThread t1 = new MThread();
		t1.setName("T1");
		t1.start();
		System.out.println("main ends");
		t1.start();

	}

}
