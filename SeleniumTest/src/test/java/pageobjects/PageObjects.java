package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjects {

	
	
	
	public static  By usernameFiled=By.name("username");
	
	public static  By passwordFiled=By.name("password");
	
	public static  By login=By.xpath("//button[@type='submit']\"");
	
	/*@FindBy(xpath="//input[@name='username']")
	public static WebElement usernamefiled;
	
	
	@FindBy(xpath="//input[@name='password']")
	public static WebElement passwordfiled;
	
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement submit;*/

	
	

}
