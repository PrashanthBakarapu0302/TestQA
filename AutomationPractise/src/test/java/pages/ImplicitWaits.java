package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriver driver;
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Prashanth");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("uetrey@gamil.com");
		
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("908292928");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='submit']")));
		
		ele.click();
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		//driver.close();
		
	}

}
