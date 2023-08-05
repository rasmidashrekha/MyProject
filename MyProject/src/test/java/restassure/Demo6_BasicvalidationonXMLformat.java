package restassure;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

/**
 * 1)Verifying Single content in XML Response
 * 2)Verifying Multiple Contents in XML Response
 * 3)Verifying all the content in XML response in one go
 * 4)Find values using XML Path in XML response
 * 5)Xpath with text()function
 * @author dashr
 *
 */
public class Demo6_BasicvalidationonXMLformat {
//1) Verifying Single content in XML Response
	@Test(priority=1)
	 void testSingleContent() {
		given()
		.when()
		.get("http://thomas.bayar.com/sqlrest/CUSTOMER/10/")
		.then()
		.body("CUSTOMER.ID",equalTo("15"))
		.log().all();
		
	}
	@Test(priority=2)
	 void testmultipleContent() {
		given()
		.when()
		.get("http://thomas.bayar.com/sqlrest/CUSTOMER/10/")
		.then()
		.body("CUSTOMER.ID",equalTo("15"))
		.body("CUSTOMER.FIRSTNAME",equalTo("Bill"))
		.body("CUSTOMER.LASTNAME",equalTo("Clancy"))
		.body("CUSTOMER.STREET",equalTo("319 Upland pl."))
		.body("CUSTOMER.CITY",equalTo("Seallte"));
		
	}
	
	// * 3)Verifying all the content in XML response in one go

	@Test(priority=3)
	 void testmultipleContentinonego() {
		given()
		.when()
		.get("http://thomas.bayar.com/sqlrest/CUSTOMER/10/")
		.then()
		.body("CUSTOMER.text()",equalTo("15BillClancy319 Upland pl.Seattle"));
		
	}
	// * 4)Find values using XML Path in XML response
@Test(priority=4)
void testUsingxpath1()
{
	given()
	.when()
	.get("http://thomas.bayar.com/sqlrest/CUSTOMER/10/")
	.then().body(hasXPath("/CUSTOMER/FIRSTNAME",containsString("Bill")));
	
}
@Test(priority=5)
void testUsingxpath2()
{
	given()
	.when()
	.get("http://thomas.bayar.com/sqlrest/INVOICE/")
	.then()
	.body(hasXPath("/INVOICEList/INVOICE[text()='30']"))
	.log().all();
		
}
}
//5)Xpath with text()function

		

