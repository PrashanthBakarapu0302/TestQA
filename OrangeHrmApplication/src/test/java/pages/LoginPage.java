package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass{
//WebDriver driver;
	//Working on master

public  LoginPage(WebDriver driver)
{
	BaseClass.driver=driver;
	PageFactory.initElements(driver,this);
	
	
}
   @FindBy(xpath="//input[@name='username']")
	 WebElement username;
	
	
	@FindBy(xpath="//input[@name='password']")
	 WebElement password;
	
	
	@FindBy(xpath="//button[@type='submit']")
	 WebElement LoginBtn;
	
	@FindBy(xpath="//span[text()='Admin']")
	WebElement AdminButton;
	
	@FindBy(xpath="//div[@class='orangehrm-header-container']/button")
	WebElement Add;
	
	@FindBy(xpath="//li[@class='oxd-userdropdown']//i")
	WebElement logout;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logoutApp;
	
	
	
	@FindBy(xpath="(//span[@class='oxd-topbar-body-nav-tab-item'])[2]/i")
	WebElement JobButton;
	
	@FindBy(xpath="//a[text()='Job Titles']")
	WebElement JobTitle;
	
	@FindBy(xpath="(//div[@class='orangehrm-container']/div/div/div)[2]/div/div[1]")
	WebElement firstRowJobTitle;
	
	@FindBy(xpath="(//div[@class='oxd-table-cell-actions']/button)[1]")
	WebElement deletebuttonJobTitle;
	
	@FindBy(xpath="//span[text()='Organization ']")
	private WebElement organization;
	
	@FindBy(xpath="//a[text()='General Information']")
	private WebElement general;
	//QA-LEAD BRANCH IS TESTING
	
	public void setUsername(String userName1,String password1)
	{
		username.sendKeys(userName1);
		password.sendKeys(password1);
		
	}
	
	
	public void ClickLogin() throws InterruptedException
	{
 LoginBtn.click();
 System.out.println(driver.getCurrentUrl());
 System.out.println(driver.getPageSource());
 System.out.println(driver.getTitle());
Thread.sleep(5000);
	}
	//QA LEad is woorking  now
	
	public void Clicking_on_Admin_Button()
	{
		
		AdminButton.click();
		//Add.click();
		System.out.println(driver.getTitle());
	}
	
	
	public void LogoutApplication()
	{
		logout.click();
		logoutApp.click();
	}
	
	public void JobTitlePage()
	{
		JobButton.click();
		JobTitle.click();
		firstRowJobTitle.click();
		deletebuttonJobTitle.click();
	}
	
	public void ClickOrganization()
	{
		organization.click();
	}
	
	public void GeneralOrganization()
	{
		general.click();
	}
}
