package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver;
		 
		driver= new ChromeDriver();
		
		driver.navigate().to("https://www.makemytrip.com/");

		driver.manage().window().maximize();
		
		Alert alt= driver.switchTo().alert();
		alt.dismiss();
		WebElement form=driver.findElement(By.xpath("//label//input[@id='fromCity']"));
		
		form.click();
		Thread.sleep(2000);

		form.sendKeys("Hyd");
		form.sendKeys(Keys.ARROW_DOWN);
		//form.sendKeys(Keys.ARROW_RIGHT);
		form.sendKeys(Keys.ENTER);
	}

}
