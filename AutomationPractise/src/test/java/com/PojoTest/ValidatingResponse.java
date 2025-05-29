package com.PojoTest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class ValidatingResponse {
	
	
	
	@Test
	public void TestJSONResponse()
	{
		
		given().contentType("Content.json")
		
		.when()
		.get("https://petstore.swagger.io/v2/user/createWithList")
		
		.then()
		
		.statusCode(200);
	
		
		
		
	}

}
