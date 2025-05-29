package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		 
		driver= new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=12772828973654895729&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9210301&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");

		driver.manage().window().maximize();
		
		List <WebElement> links =driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getAttribute("href"));
			System.out.println(links.get(i).getText());
		}
		
	}

}
