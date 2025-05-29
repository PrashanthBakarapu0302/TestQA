package pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		String ParentWindow=driver.getWindowHandle();
		
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a[1])")).click();
		
		Set<String>allwindows1 =driver.getWindowHandles();
		
		for(String childwindow:allwindows1)
		{
			if(!childwindow.equals(ParentWindow))
			{
				driver.switchTo().window(childwindow);
				
				driver.navigate().refresh();
				
				System.out.println(driver.getTitle());
				driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a[1])")).click();
						}
			
			Set<String>allwindows2=driver.getWindowHandles();
			for(String grandchild:allwindows2)
			{
				if(!grandchild.equals(childwindow) && !grandchild.equals(ParentWindow))
				{
					driver.switchTo().window(grandchild);
				}
			}
		
		
			
	//iterator
			Set<String> cwindow=driver.getWindowHandles();
			
			Iterator<String> itr=cwindow.iterator();
			
			while(itr.hasNext())
			{
				String child=itr.next();
				if(!ParentWindow.equals(child))
				{
					driver.switchTo().window(child);
				}
			}
			
			
		}
		
		
	}

}
