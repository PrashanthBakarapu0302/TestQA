package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckboxRadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath("//input[@id='gender']"));
	
		ele.click();
		driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
		
		System.out.println(ele.isSelected());
	}
	
}
