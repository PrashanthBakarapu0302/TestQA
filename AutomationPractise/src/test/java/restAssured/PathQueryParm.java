package restAssured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


//https://reqres.in/api/unknown?id=5

public class PathQueryParm {

	
	@Test
	public void PathQuery()
	{
		given()
		.pathParam("test","unknown")		
	    .queryParam("id","5")
		
		.when()
		.get("https://reqres.in/api/{test}")
		
		.then()
		.statusCode(200)  
	.log().cookies()
	.log().headers()
	
		.log().all();
		
	
	
	}
}
