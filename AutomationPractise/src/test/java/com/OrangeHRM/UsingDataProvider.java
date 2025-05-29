package com.OrangeHRM;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsingDataProvider {

	
	@Test(dataProvider="CommonType",dataProviderClass=DataProviderTest.class)
	public void SetUp(String Username,String Password)
	{
		System.out.println(Username +" "+Password);
		
	}
	
	
	@Test(dataProvider="CommonType",dataProviderClass=DataProviderTest.class)
	public void Set(String Uname,String Pwd,String name)
	{
		System.out.println(Uname +" "+Pwd+" "+name);
	}
}
