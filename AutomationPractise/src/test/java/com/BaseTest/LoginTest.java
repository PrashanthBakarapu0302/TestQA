package com.BaseTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	
WebDriver driver;	
	@BeforeTest
	public void LoginToApplication()
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    System.out.println("baseTestpackagelogin class");
	
	
	}
	
	@AfterTest
	public void TearDown()
	{
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	
	
	@Test
	public void AdminPage()
	{
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		String ExpectedTitle=driver.getCurrentUrl();
	    String ActualTitle="https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
	Assert.assertEquals(ActualTitle, ExpectedTitle);
	System.out.println(ExpectedTitle +" "+ActualTitle );
	
	}
	
	@Test(enabled=false)
	public void AdminTest()
	{
		 driver.findElement(By.xpath("//span[text()='PIM']")).click();
		 System.out.println("admintestb");
	}

}
