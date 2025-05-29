package restAssured;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class JsonObjectOrg {
	int id;
	@Test(priority=1)
	public void PostCreateUser()
	{
		
		
		JSONObject data= new JSONObject();
		data.put("id","0");
		data.put("username","Software");
		data.put("firstName", "31");
		
		data.put("lastName","reddy");
		data.put("email","Software@gmail.com");
		data.put("phone", "9090090");
		data.put("userStatus", "0");
		
		id=given().contentType("application/json")
		.body(data.toString())
		
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
		.body(data.toString())
		
		.when().put("https://petstore.swagger.io/v2/user/createWithList/"+id)
		
		.then().statusCode(200)
		
		.log().all();

		}
	


}
