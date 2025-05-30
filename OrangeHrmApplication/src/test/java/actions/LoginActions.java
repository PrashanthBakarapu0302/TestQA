package actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.LoginPage;
import utilities.ConfigReader;

public class LoginActions {

	LoginPage loginpage;
	WebDriver driver;
	
	public LoginActions(WebDriver driver)
	{
		this.driver=driver;
		loginpage= new LoginPage(driver);
	}
	
	public void enterCredentails()
	{
		loginpage.setUsername(ConfigReader.getProperty("username1"), ConfigReader.getProperty("password1"));
	
	}
	
	public void ClickLogin() throws InterruptedException
	{
		loginpage.ClickLogin();
	}
	
	public void ClickAdminButton()
	{
		loginpage.Clicking_on_Admin_Button();
	}
	
	public void Logout() throws InterruptedException
	{
		Thread.sleep(5000);
		loginpage.LogoutApplication();
	}
	public void tearDown()
	{
		driver.close();
		//driver.quit();
	}
	
	public void JobTitle() throws InterruptedException
	{
		loginpage.JobTitlePage();
	
	}
	
	public void Organization()
	{
		loginpage.ClickOrganization();
		
	}
	
	public void General()
	{
		loginpage.GeneralOrganization();
	}
	
	public void setUsernameandpassword(String userName1, String password1)
	{
		loginpage.setUsername(userName1, password1);
		
	}
	
}
