package com.kodnest.multithreaded;

public class Task1 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread());
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}

}
