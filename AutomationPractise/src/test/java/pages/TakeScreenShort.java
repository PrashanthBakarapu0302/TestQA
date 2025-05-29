package pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShort {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Prashanth");
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(screenshotFile,new File(".//screenshort/screen.png"));
		
		FileHandler.copy(screenshotFile, new File(".//screenshort/screen.png"));
		
	}

}
