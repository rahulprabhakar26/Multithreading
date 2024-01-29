package com.kodnest.multithreaded;

public class Task2 extends Thread{
   public void run() {
	   System.out.println(Thread.currentThread());
	   for(int i ='A'; i<='Z';i++) {
		   System.out.println((char)i);
	   }
   }
}
