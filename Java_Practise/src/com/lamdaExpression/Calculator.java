package com.lamdaExpression;

public interface Calculator {
	
	
	public  int addition(int a,int b);
	
	public static void m1()
	{
		System.out.println("hello m1");
	}
	
	public default void m2()
	{
		System.out.println("hello m2");
	}
	

}
