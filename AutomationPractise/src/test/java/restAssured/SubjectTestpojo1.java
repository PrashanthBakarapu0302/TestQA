package restAssured;

import org.testng.annotations.Test;

import restAssured.Pojo1;


import static io.restassured.RestAssured.given;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.JSONObject;
import org.testng.annotations.Test;

public class SubjectTestpojo1 {
	
	
	@Test
	public void Testing()
	{
		
		Pojo1 data= new Pojo1();
		data.setEmail("prsad@gmail.com");
		
		List<String> sublist= new ArrayList<>();
		
		sublist.add("maths");
		sublist.add("physics");
		
		given()
		.when().get("https://facebook.com")
		.then().statusCode(200)
		;
		
	}

}
