package com.kodnest.multithreaded;

public class Main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		
		Task1 t1 = new Task1();//thread object creation 
		Task2 t2 = new Task2(); // thread object creation
		 
		t1.setName("first-thread");
		t2.setName("second-thread");
		
		 t1.setPriority(6);
		 t2.setPriority(8);
		 
		 
		t1.start();
		t2.start();
	}

}
