package com.threads;

public class MThread extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" in run");
	}
}

