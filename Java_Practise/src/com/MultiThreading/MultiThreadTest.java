package com.MultiThreading;

public class MultiThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello welcome to multi thread in java");
		
		/*System.out.println("hello welcome to multi thread in selenium");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread().getPriority());*/
		
		Thread t1= new Thread();
		t1.start();
		
		Thread t2= new Thread();
		t2.start();
		//t1.run();
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread().getName());
		
	}

}
