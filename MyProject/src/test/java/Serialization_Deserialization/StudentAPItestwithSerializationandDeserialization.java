package Serialization_Deserialization;
import java.util.ArrayList;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class StudentAPItestwithSerializationandDeserialization {
	@Test(priority=1)
public void createNewStudentSerialization()
{
ArrayList<String> coursesList=new ArrayList<String>();
coursesList.add("java");
coursesList.add("selenium");

Student stu=new Student();
stu.setSID(101);
stu.setFirstName("john");
stu.setLastName("Deo");
stu.setEmail("abc@gmail.com");
stu.setprogramm("computer Science");
stu.setCourses(coursesList);

given()
  .contentType(ContentType.JSON)
   .body(stu)
.when()
   .post("http://localhost:8085/student")
.then()
   .statusCode(201)
   .assertThat().body("msg",equalTo("Student added"));
}
	@Test(priority=2)
	void getStudentRecordDeserilization() {
		Student stu=get("http://localhost:8085/student/101").as(Student.class);
		System.out.println(stu.getStudentRecord());
		Assert.assertEquals(stu.getSID(),101);
	}
}
