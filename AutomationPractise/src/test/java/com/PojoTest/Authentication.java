package com.PojoTest;

import static io.restassured.RestAssured.given;

import com.PojoClassess.User;
import com.Utilities.JsonUtil;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
public class Authentication {

	@Test 
	
	//Base Authentocation
	public void Base()
	{
		RestAssured.baseURI ="https://reqres.in/api";
		JsonUtil.fromJsonFile("src\\test\\java\\com\\JsonFiles\\user.json",User.class);
		given().auth().basic("test","test123")
		.when().get("htts://postman=echo/com")
		.then().statusCode(200);
	}
	
	@Test
	//Bearer Token Autication
	public void  BarerTokenAuthentication()
	{
		String Barrertoken="hdueundie_eneidiee";
		Faker fake= new Faker();
		given().headers("Authorization","Barere" +Barrertoken)
		
		.when()
	.then();
	}
	
	
	
}
