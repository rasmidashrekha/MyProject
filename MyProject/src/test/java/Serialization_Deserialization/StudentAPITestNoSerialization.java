package Serialization_Deserialization;

import java.util.ArrayList;
import java.util.HashMap;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.http.ContentType;
public class StudentAPITestNoSerialization {

	public HashMap map=new HashMap();
//Post request creates a new student record
@Test(priority=1)
public void createNewStudent() {
	map.put("id",101);
	map.put("firstName","pavan");
	map.put("lastName","kumar");
	map.put("email","abcxyz@gmail.com");
	map.put("programme","Manager");
	
	ArrayList<String>coursesList=new ArrayList<String>();
	coursesList.add("java");
	coursesList.add("Selenium");
	map.put("courses", coursesList);
	
	given()
	   .contentType(ContentType.JSON)
	   .body(map)
	.when()
	   .post("http://localhost:8085/student")
	 .then()
	    .statusCode(201)
	    .assertThat()
	    .body("msg",equalTo("Student added"));
	
	
	
}

//Get Request to retrieve student details
@Test(priority=2)
void getStudentRecord()
{
	given()
	   .when()
	      .get("http://localhost:8085/student/101")
	    .then()
	       .statusCode(200)
	       .assertThat()
	       .body("id",equalTo(101))
	       .log().all();
}
}
