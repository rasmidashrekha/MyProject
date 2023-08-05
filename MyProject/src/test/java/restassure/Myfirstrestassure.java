package restassure;
//http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class Myfirstrestassure {
	@Test
	public static void getweatherrequest()
	{
		given()
		.when().get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1,1 200 OK")
		.assertThat().body("City",equalTo("Hydrabad"))
		.header("Content-Type","application/json");
		
	}

}
