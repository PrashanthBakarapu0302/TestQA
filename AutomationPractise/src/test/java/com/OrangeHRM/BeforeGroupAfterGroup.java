package com.OrangeHRM;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class BeforeGroupAfterGroup {
	
	
	@Test(groups= {"sanity"})
	
	public void Luanch()
	{
		System.out.println("launchbrowser");
	}
	
	
	@Test(groups= {"smoke"})
	public void Test()
	{
		System.out.println("test");
	}
	
	
	@Test(groups= {"sanity"})
	public void Demo()

	{
		System.out.println("hello demo");
	}
	
	@BeforeGroups({"smoke"})
	public void Init()
	{
		System.out.println("starting point");
	}
	
	@AfterGroups({"sanity"})
	public void after()
	{
		System.out.println("after groups Test");
	}

}
