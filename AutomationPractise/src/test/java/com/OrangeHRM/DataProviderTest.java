package com.OrangeHRM;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.collections.Objects;

public class DataProviderTest {
	
	
	
	@DataProvider(name="test")
	
	public Object[][] dataset()
	{
		return new Object[][] {
			{"admin","admin123"},
			{"test","testing"}
				
		};
	}
	
	
	@DataProvider(name="CommonType")
	
	public Object[][] data(Method M)
	{
		Object[][] testdata=null;
		if(M.getName().equals("SetUp"))
		{
			testdata = new Object[][] {
				{"admin","uteue"},
				{"tests","yetey"}
							};
							
								}
		else if(M.getName().equals("Set"))
		{
			testdata=new Object[][]
					{
				{"admin","pasword","test"},
				{"admin1","pasword1","test1"},
				{"admin2","pasword2","test2"}
					};
		}
		return testdata;
	}
		
}
