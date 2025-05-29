package restAssured;

import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
public class HttpRequests {
	
	int id;
	
	@Test
	public void GetUserDeatils()
	
	{
		given()
		.when().get("https://reqres.in/api/unknown")
		
		.then().statusCode(200)
		.body("page",equalTo(1))
		.body("per_page",equalTo(6))
		.log().all();
		
		
	}

	@Test(priority=1)
	public void PostCreateUser()
	{
		
		
		HashMap data= new HashMap();
		data.put("id","0");
		data.put("username","Software");
		data.put("firstName", "31");
		
		data.put("lastName","reddy");
		data.put("email","Software@gmail.com");
		data.put("phone", "9090090");
		data.put("userStatus", "0");
		
		id=given().contentType("application/json")
		.body(data)
		
		.when().post("https://petstore.swagger.io/v2/user/createWithList")
		
		.jsonPath().getInt("id");
		//.then().statusCode(200)
		//.log().all()
	    
	}
	
	@Test(priority=3,dependsOnMethods= {"PostCreateUser"})
	public void UpdateUser()
	{
		HashMap data= new HashMap();
		data.put("username","SoftwareEngineer");
		data.put("firstName", "helllo");
		
		data.put("lastName","reddyP");
		data.put("email","Software@gmail.com");
		data.put("phone", "9090090");
		data.put("userStatus", "0");
		
		given().contentType("application/json")
		.body(data)
		
		.when().put("https://petstore.swagger.io/v2/user/createWithList/"+id)
		
		.then().statusCode(200)
		.log().all();
	}
	
	
}
