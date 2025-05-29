package pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
//import pageObjects.LoginPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.LoginPageObjects;
public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginPageObjects obj= new LoginPageObjects(driver);
		Thread.sleep(6000);
		driver.manage().window().maximize();
		/*obj.enterusername("Admin");
		obj.enterpassword("admin123");
		obj.login();*/
		
		String ParentWindow =driver.getWindowHandle();
		
		//System.out.println(windowId);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
	    Set<String>windowids=driver.getWindowHandles();
	    List<String> windowidlist= new ArrayList<>(windowids);
	    
	    for(String win:windowidlist)
	     {
		String windowTitle= driver.switchTo().window(win).getTitle();
		System.out.println(windowTitle);
		
		if(windowTitle.equals("OrangeHRM"))
		{
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			driver.navigate().back();
			
		}
		else if(windowTitle.contains("OrangeHRM HR Software"))
		{
			
			driver.findElement(By.xpath("(//button[text()='Book a Free Demo'])[2]")).click();
			Thread.sleep(3000);
			
			//driver.close();
			driver.switchTo().window(ParentWindow);
			
			System.out.println(driver.getTitle());
		}
		  
	  }
	}

}
