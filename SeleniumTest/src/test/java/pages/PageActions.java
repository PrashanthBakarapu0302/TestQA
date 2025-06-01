package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageobjects.PageObjects;
public class PageActions {

	WebDriver driver;
	//hello08929
	public PageActions(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterusername(String USERNAME,String PASSWORD)
	
	{
	driver.findElement(PageObjects.usernameFiled).sendKeys(USERNAME);	
	driver.findElement(PageObjects.passwordFiled).sendKeys(PASSWORD);
	}
	
	public void  clicklogin()
	{
		driver.findElement(PageObjects.login).click();;
	}
	
}
