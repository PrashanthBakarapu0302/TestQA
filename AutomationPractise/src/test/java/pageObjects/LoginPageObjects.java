package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

	
	private WebDriver driver;
	
	@FindBy(name="username")
	private WebElement usernameField;
	
	@FindBy(name="password")
	private WebElement passwordField;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginbutton;
	
	public LoginPageObjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterusername(String username)
	{
		usernameField.sendKeys(username);
	}
	
	public void  enterpassword(String password)
	{
		passwordField.sendKeys(password);
	}
	
	public void  login()
	{
		loginbutton.click();
	}
}
