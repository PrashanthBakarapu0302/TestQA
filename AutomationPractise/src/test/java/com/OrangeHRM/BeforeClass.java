package com.OrangeHRM;

import org.testng.annotations.Test;

public class BeforeClass {
	
	@Test
	public void demo()
	{
		System.out.println("hello demo");
	}
	
	
	@Test
	public void Die()
	{
		System.out.println("namaskar die");
	}
	
	
	@org.testng.annotations.BeforeClass
	public void startingClass()
	{
		System.out.println("first execution in class");
	}
	

	
@org.testng.annotations.AfterClass
public void AfterClass()
{
	System.out.println("after execution in class");
}
}
