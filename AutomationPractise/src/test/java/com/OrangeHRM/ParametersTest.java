package com.OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
	
	WebDriver driver;
	
	@Parameters({"browser"})
	
	@Test
	public void LaunchBrowser(String browser)
	{
		if(browser.equals("Chrome"))
		{
		driver=new ChromeDriver();
		
		}
		
		else if(browser.equals("firefox"))
		{
			driver= new FirefoxDriver();
		}
	}

}
