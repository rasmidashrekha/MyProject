package Serialization_Deserialization;

import java.util.List;

public class Student {
	public Integer id;
	public String firstname;
	public String lastname;
	public String email;
	public String programme;
	
	List<String> courses;
	public int getSID() {
		return id;
	}
	public void setSID (Integer id){
		this.id=id;
	}
	
	public String getFirstName() {
		return firstname;
	

}
	public void setFirstName(String firstname) {
		this.firstname=firstname;
	}
	

	public String getLastName() {
		return lastname;
	

}
	public void setLastName(String lastname) {
		this.lastname=lastname;
	}
	
	public String getEmail() {
		return firstname;
	

}
	public void setEmail(String email) {
		this.email=email;
	}
	
	

	public String getprogramm() {
		return programme;
	

}
	public void setprogramm(String programme) {
		this.programme=programme;
	}
	
	public List<String>getCoures() {
		return courses;
	

}
	public void setCourses(List<String> courses) {
		this.courses=courses;
	}
	
	public String getStudentRecord()
	{
		return(this.id+""+this.firstname+""+this.lastname+""+this.email+""+this.programme+""+this.email+""+this.courses);
	}
	
	
}
