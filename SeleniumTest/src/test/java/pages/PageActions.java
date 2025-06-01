package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageobjects.PageObjects;
public class PageActions {

	WebDriver driver;
	
	public PageActions(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterusername(String USERNAME,String PASSWORD)
	
	{
	driver.findElement(PageObjects.usernameFiled).sendKeys(USERNAME);	
	driver.findElement(PageObjects.passwordFiled).sendKeys(PASSWORD);
	}
	//hello0892909900
	public void  clicklogin()
	{
		driver.findElement(PageObjects.login).click();;
	}
	
}
