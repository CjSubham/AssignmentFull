package OverideMethodToString;

public class Student {
//I would like to store some student datails
//Best practice in Full Stack Development in terms of Instance variable is usig them in Private access spicifier
	
	private String studentName;
	private int studentAge;
	private String city;
	//we need a contructor to initialize the value into the instance variable
	Student(String studentName, int studentAge, String city) {
		
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student details : [studentName=" + studentName + ", "
		+ "studentAge=" + studentAge + ", "
				+ "city=" + city + "]";
	}
	
	
	
	
	
	
	
	
	
}
