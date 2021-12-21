package Encapsulation;

class student_info{
	//student roll,first name,last name,marks,city,depart.,
	//student info as declared as instance variable
	private int stusn;
	private String stfname;
	private String stlname;
	private int marks;
	private String dept;
	private String city;
	//create getter and setter method
	public int getStusn() {
		return stusn;
	}
	public void setStusn(int stusn) {
		this.stusn = stusn;
	}
	public String getStfname() {
		return stfname;
	}
	public void setStfname(String stfname) {
		this.stfname = stfname;
	}
	public String getStlname() {
		return stlname;
	}
	public void setStlname(String stlname) {
		this.stlname = stlname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}

public class Student {

	public static void main(String[] args) {
		student_info si = new student_info();
				si.setStusn(34);
				si.setStfname("Subham");
				si.setStlname("Majumdar");
				si.setMarks(87);
				si.setDept("ETC");
				si.setCity("Rourkela");
				System.out.println("Roll No---"+si.getStusn());
				System.out.println("First Name---"+si.getStfname());
				System.out.println("Last Name---"+si.getStlname());
				System.out.println("Marks---"+si.getMarks());
				System.out.println("Dept---"+si.getDept());
				System.out.println("City---"+si.getCity());

	}

}
