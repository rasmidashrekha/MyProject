package restassure;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;

public class Demo2postrequest {
	public static HashMap map=new HashMap();
	@BeforeClass
	public void postdate()
	{
		
	map.put("FirstName",Restutiils.getFirstName());	
	map.put("FirstName",Restutiils.getLastName());
	map.put("FirstName",Restutiils.getUserName());
	map.put("FirstName",Restutiils.getPassword());
	map.put("FirstName",Restutiils.getEmail());
	
	RestAssured.baseURI="http://restapi.demoqa.com/customer";
	RestAssured.basePath="/register";
	}
	@Test
	public void testdata() 
	{
	given()
	.contentType("application/json")
	.body(map)
	.when()
	
	    .post()
	    
	.then()
	  .statusCode(201)
	   .body("SuccessCode",equalTo("OPERATION_SUCCESS"))
	    .and()
	    .body("Message",equalTo("Operation completed successfully"));
	
	}

}
