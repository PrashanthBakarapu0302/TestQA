package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import actions.LoginActions;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseClass{

		LoginActions login= new LoginActions(BaseClass.driver);
		
	@Given("user is on login page")
	public void launchApp() {
	    // Write code here that turns the phrase above into concrete actions
		launchBrowser();
		login=new LoginActions(driver);
	    
	}
	
	
	@When("user eneter valid username and password")
	public void user_eneter_valid_username_and_password() throws InterruptedException {
	    login.enterCredentails();
	    login.ClickLogin();
	   // login.tearDown();
	}
	
	@And("Click on Admin Button on the Dashboard") 
	public void Click_On_Admin()
	{
		login.ClickAdminButton();
	}
	
	@Then("user should able to logout from the Application")
	public void Logout() throws InterruptedException
	{
		login.Logout();
		
	}
	
	
	@And("Click on Job button and Job Titles")
	public void Click_on_Job_and_jobtitle() throws InterruptedException
	{
		login.JobTitle();
	}
	
	@Then("user should able to delete the record successfully")
	public void Delete_Job_Title() throws InterruptedException
	{
		Thread.sleep(5000);
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement deletebutton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='orangehrm-modal-footer']/button[2]")));
		deletebutton.click();
	}
	
	@And("Click on Organization Tab")
    public void click_Organization()
    {
		login.Organization();
    }
	
	@Then("user should able to view the General Information")
	public void organization()
	{
		login.General();
	}
	
	@When("user enter valid {string} and {string}")
	public void enter_username_password(String username,String password) throws InterruptedException 
	{
		
		login.setUsernameandpassword(username, password);
		login.ClickLogin();
	}
			
}	