package Encapsulation;
//name,designation,salary,city,pin
class database{
	private String name;
	private String designation;
	private double salary;
	private String city;
	private int pin;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
}
public class Employee {

	public static void main(String[] args) {
		database db = new database();
		db.setName("SUBHAM MAJUMDAR");
		db.setDesignation("DEVELOPER");
		db.setSalary(1900.82);
		db.setCity("Rourkela");
		db.setPin(769012);
		System.out.println("Name---"+db.getName());
		System.out.println("Designation---"+db.getDesignation());
		System.out.println("Salary---"+db.getSalary());
		System.out.println("City---"+db.getCity());
		System.out.println("Dept---"+db.getPin());
		

	}

}
