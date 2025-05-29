package com.OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupsTest {
	WebDriver driver;
	@Test(priority=1,description="this is my first testng testcase",groups="regression")
	public void m1() throws InterruptedException
	{driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
    driver.findElement(By.xpath("//button[@type='submit']")).click();

		
		System.out.println("this is m1");
	}
     @Test(priority=2,description="this is my 2nd testng tc",groups={"smoke","sanity"})
	public void m2()
	{
		System.out.println("this is m2");
		Reporter.log("This is M2" );
	}
     
     @Test(priority=2,description="this is my 3rd testng tc",groups="sanity")
     public void m3()
     {
    	 Reporter.log("This is M3" );
    	 System.out.println("this is m3");
     }
    

}
