package com.PojoTest;

import com.PojoClassess.User;
import com.Utilities.JsonUtil;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class CreatedUserTest {
	

	@Test
	//rekha
	public void UserTest()
	{
		RestAssured.baseURI ="https://reqres.in/api";
		JsonUtil.fromJsonFile("src\\test\\java\\com\\JsonFiles\\user.json",User.class);
		given()
		.when()
		.then().statusCode(200)
		.log().all();
		
	}
	
	
	


}
