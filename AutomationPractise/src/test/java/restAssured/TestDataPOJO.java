package restAssured;

import static io.restassured.RestAssured.given;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class TestDataPOJO {

	
	//Testing a new feature

	//Adding code for mergeconflict

	@Test
	public void TestUsingPOJO()
	{
		
		POJO data= new POJO();
		
		data.setName("prashnath");
		data.setLocation("india");
		data.setPhone("123432");
		
		String course[]= {"java","selenium"};
		
		data.setCourses(course);
		
	
	given().contentType("application/json")
	.body(data)
	
	.when().put("https://petstore.swagger.io/v2/user/createWithList")
	
	.then().statusCode(200)
	//.body(null, null)
	.log().all();

}
}