package com.OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PractisData {
	
	
	
	//private static final String dataprovider = null;

	@DataProvider(name="test")
	public Object[][] dataset()
	{
		return new Object[][] {
			
			{"admin","admin123"},
			{"Admin","admin54"},
			{"test","hello"}
	};
	
	}
	
	@Test(dataProvider="test")
	public void setup(String uname,String pwd)
	{
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}