package com.OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends Testing {
	WebDriver driver;
	
	@Test(priority=1,description="this is my first testng testcase")
	public void m1()
	{
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.close();
		System.out.println("this is m1");
	}
     @Test(priority=2,description="this is my 2nd testng tc")
	public void m2()
	{
		System.out.println("this is m2");
	}
     
     @Test(priority=2,description="this is my 3rd testng tc")
     public void m3()
     {
    	 System.out.println("this is m3");
     }
     
     @BeforeTest
     public void LoginToApplication()
     {
    	 System.out.println("login to application");
     }
     
     @AfterTest
     public void LogoutTOApplication()
     {
    	 System.out.println("logout to application");
     }
     
}
