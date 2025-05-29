package com.OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BeforeMethodAfterMethod {
	WebDriver driver;
	
	@Test(priority=1)
	public void T1()
	{
		System.out.println("hello t1");
	}
	
	@Test(priority=2)
	public void T2()
	{
		System.out.println("hello t2");
	}
	@Test(priority=3)
	public void T3()
	{
		System.out.println("hello t3");
	}

	@BeforeMethod
	public void Test()
	{
		System.out.println("Hello Before Method");
	}
	
	@AfterMethod
	public void TestAfter()
	{
		System.out.println("Hello After Method");
	}
	
	@BeforeTest
	public void BeforeT()
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
	    driver.findElement(By.xpath("//a[text()='Reports']")).click();
	
	System.out.println(driver.getTitle());
	
	}
	
	@AfterTest
	public void AfterT()
	{
		System.out.println("AFTER TEST");
	}
	
}
