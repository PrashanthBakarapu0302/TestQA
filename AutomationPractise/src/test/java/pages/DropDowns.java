package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	
        WebDriver driver = new ChromeDriver();
        
        try {
            // Open your target webpage
            driver.get("https://www.salesforce.com/in/form/signup/freetrial-salesforce-starter/?d=jumbo1-btn-ft");  // Change to your actual URL

            // Locate the dropdown (change the XPath to your dropdown's actual XPath)
            WebElement dropdownElement = driver.findElement(By.xpath("//select[starts-with(@id,'CompanyCountry')]"));
            
            // Create Select object for interacting with the dropdown
            Select select = new Select(dropdownElement);

            // Check if it's a multi-select dropdown
            boolean isMultiple = select.isMultiple();
            System.out.println("Is dropdown multi-select: " + isMultiple);

            // Get all options in the dropdown
            List<WebElement> options = select.getOptions();
            System.out.println("Total number of countries: " + options.size());

            // Iterate through all the options and select them
            for (int i = 0; i < options.size(); i++) {
                WebElement option = options.get(i);
                String countryName = option.getText();

                // Check if the option is enabled (skip disabled options)
                if (!option.isEnabled()) {
                    System.out.println("Skipping disabled country: " + countryName);
                    continue;  // Skip this disabled option
                }

                // Select the country by index or text
                select.selectByIndex(i);  // You can also use select.selectByVisibleText(countryName);
                System.out.println("Selected country: " + countryName);

                // Optional: Perform some verification or validation for each selection (e.g., verify the page updates after selection)
                // Example: Verify the option is selected or logged
               /* if (select.getFirstSelectedOption().getText().equals(countryName)) {
                    System.out.println("Successfully selected: " + countryName);
                } else {
                    System.out.println("Failed to select: " + countryName);
                }*/

                // Optional: Deselect the country if multi-select dropdown (for testing deselect)
             /* if (isMultiple) {
                    select.deselectByIndex(i);  // Deselect by index
                }*/
            }

            // Optional: Deselect all selections if it's a multi-select dropdown
            /*if (isMultiple) {
                select.deselectAll();
            }*/

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
        
        
	}
