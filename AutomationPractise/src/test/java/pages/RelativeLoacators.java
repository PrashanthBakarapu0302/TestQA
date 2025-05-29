package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class RelativeLoacators {

		public static void main(String[] args)  {
			// TODO Auto-generated method stub
			
			WebDriver driver;
			driver=new ChromeDriver();
			driver.get("https://www.salesforce.com/in/form/signup/freetrial-salesforce-starter/?d=jumbo1-btn-ft");
			driver.manage().window().maximize();
			
			System.out.println(driver.getTitle());
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//System.out.println(driver.getTitle());
			
   /*WebElement str=driver.findElement(By.xpath("//select[starts-with(@id,'CompanyCountry')]"));
     str.click();*/
			
		WebElement dp=driver.findElement(By.xpath("//select[starts-with(@id,'CompanyCountry')]"));
        Select sc= new Select(dp);
        sc.selectByIndex(19);
        sc.selectByVisibleText("Austria");
        sc.selectByValue("DZ");
        
      
        }
        
 
	
			
			
			
		}


