package pages;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=9541288147275430670&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9210301&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.partialLinkText("Amazon")).click();
		
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		
		driver.findElement(By.name("email")).sendKeys("7036177626");
		driver.findElement(By.className("a-button-input")).click();
		driver.close();
		
		//links finding
		/*driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=9541288147275430670&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9210301&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement>links =driver.findElements(By.tagName("a"));
		
		for(WebElement link:links)
		{
			
			System.out.println(link.getText());
		}
		*/
		
}
}
