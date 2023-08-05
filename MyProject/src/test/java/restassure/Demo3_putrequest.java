package restassure;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;

public class Demo3_putrequest {
	public static HashMap map=new HashMap();
	String empName=Restutiils.empName();
	String empSal=Restutiils.empSal();
	String empAge=Restutiils.empAge();
	int emp_id=11254;
	@BeforeClass
	public void putdata() 
	{
		map.put("name",empName);	
		map.put("salary",empSal);
		map.put("age",empAge);
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/update/"+emp_id;
		
			
	}
	@Test
	public void testPUT()
	{
		given()
		   .contentType("application/json")
		   .body(map)
		.when()
		   .put()
		 .then()
		    .statusCode(200)
		     .log().all();
		   
		
		
	}

}
