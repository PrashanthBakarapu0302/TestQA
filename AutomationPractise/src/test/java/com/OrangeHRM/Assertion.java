package com.OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	
	WebDriver driver;
	
	@Test(priority=1)
	public void ALogin()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    System.out.println("baseTestpackagelogin class");
		
	    driver.findElement(By.xpath("//span[text()='PIM']")).click();
	    driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
	    //driver.findElement(By.xpath("//a[text()='Reports']")).click();
	    //driver.close();
	}
}



