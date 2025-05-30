package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	features="src\\test\\java\\Features"
 ,glue= {"stepDefinitions","hooksmy"},
 tags="@tag") 



public class TestRunner {

}
