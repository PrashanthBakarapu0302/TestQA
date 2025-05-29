package com.Functions;

@FunctionalInterface
public interface Car {
	
	
	public void driver();
	
	public default void m1()
	{
		System.out.println("m1 interface");
	}

	
	public default void m2()
	{
		System.out.println("m2 static interface");
	}
}
