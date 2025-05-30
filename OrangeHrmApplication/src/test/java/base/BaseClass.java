package base;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilities.ConfigReader;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public void launchBrowser()
	{
		//ConfigReader reader=new ConfigRead();
		driver=new ChromeDriver();
		driver.get(ConfigReader.getProperty("url"));
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
	}
	
	
	

	
	public void tearDown()
	{
		driver.quit();
	}

}
