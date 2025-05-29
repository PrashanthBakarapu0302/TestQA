package pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.LoginPageObjects;

public class OrangeHrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		

		WebDriver driver= new ChromeDriver();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();
		
			
	String	mainparentWindow=driver.getWindowHandle();
	
	Set<String> windowHandles=driver.getWindowHandles();
	
	List<String> windowList= new ArrayList<>(windowHandles);
	
	Map<String,String> parentWindows= new HashMap<>();
	
	for(String win:windowList)
	{
		String title=driver.switchTo().window(win).getTitle();
		System.out.println(title);
		
		if(title.contains("Dashboard"))
		{
			parentWindows.put("dashboard", win);
		}
		
		else if(title.contains("OrangeHRM HR Software"))
		{
			parentWindows.put("admin", win);
		}
		
		if(title.equals("OrangeHRM"))
		{
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
		}
		else if(title.contains("OrangeHRM HR Software"))
		{
			
			driver.findElement(By.xpath("(//button[text()='Book a Free Demo'])[2]")).click();
			Thread.sleep(3000);
			
			//driver.close();
			//driver.switchTo().window(ParentWindow);
			System.out.println(driver.getTitle());
		}
		
		if(parentWindows.containsKey("dashboard"))
		{
			driver.switchTo().window(parentWindows.get("dashboard"));
			Thread.sleep(3000);
		}
		
	}
	
		
		
	}
}
