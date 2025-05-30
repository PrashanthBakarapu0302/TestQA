package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.StepDefinitionAnnotations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PageActions;
public class LoginFeature {
	
WebDriver driver;
PageActions login;
LoginFeature feature;

@Inject
private StepDefinitionAnnotations stepDefinitionState;

@Given("User launches the browser")
public void user_launches_the_browser() {
    // Write code here that turns the phrase above into concrete actions
   driver=new ChromeDriver();
   driver.manage().window().maximize();
}
@When("user open the OrangeHRM login page")
public void user_open_the_orange_hrm_login_page() {
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
@When("Enter username {string} and {string}")

   public void enter_uname_password(String username,String password)
   {
	feature=new LoginFeature(stepDefinitionState);
	   login.enterusername(username, password);
   }

@When("click on LoginButton")
public void click_on_login_button() {
    login.clicklogin();
}


}





