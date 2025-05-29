package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicsDropDown {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver=new ChromeDriver();
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-salesforce-starter/?d=jumbo1-btn-ft");  // Change to your actual URL

        // Locate the dropdown (change the XPath to your dropdown's actual XPath)
        WebElement dropdownElement = driver.findElement(By.xpath("//select[starts-with(@id,'CompanyCountry')]"));
        
        // Create Select object for interacting with the dropdown
        Select select = new Select(dropdownElement);
        select.selectByIndex(1);
        select.selectByValue("DM");
        select.selectByVisibleText("Nepal");
        boolean multi=select.isMultiple();
        System.out.println(multi);
        
        //I have drop down i want to retrieve all options from the drop down list
      List <WebElement> alloptions=  select.getOptions();
      for(WebElement option:alloptions)
      {
    	  System.out.println(option.getText());
      }
        //this methods are used for multiselect dropdown 
        //to get all selected options from the dropdown list
    	   List <WebElement> li= select.getAllSelectedOptions();
     for(WebElement option1:li)
     {
    	 System.out.println(option1.getText());
     }
     
     WebElement op=select.getFirstSelectedOption();
     System.out.println(op.getText());
       
//deselect methods only works with multi-select dropdown
     select.selectByVisibleText("Apple");
     select.selectByVisibleText("banana");
     select.selectByVisibleText("carat");
     
     select.deselectByVisibleText("banana");
     select.deselectByValue("Ap");
     select.deselectByIndex(1);
     select.deselectAll();//all the selected oprtion from dp will be deselected.
	}
}
