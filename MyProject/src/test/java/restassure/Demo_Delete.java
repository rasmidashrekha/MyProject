package restassure;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Demo_Delete {
	@Test
	public void deleteEmployeeRecord()
	{
	RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
	RestAssured.basePath="/delete/11493";
	
	Response response=
	given()
	
	.when()
	   .delete()
	 .then()
	    .statusCode(200)
	    .statusLine("HTTP/1.1 200 OK")
	.log().all()
	.extract().response();
	
	String jsonAsString=response.asString();
	Assert.assertEquals(jsonAsString.contains("successfully! deleted Records"), true);
	}

}
