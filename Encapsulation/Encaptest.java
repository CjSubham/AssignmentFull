package Encapsulation;
//creating another class with sum of var
//employee info
class employee{
private String empname="Subham";
private int empid=101;
//we can se get and set method
//getter and setter method
//we need to create methods to access the variables
//vvip==== methods should be public
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}

}
public class Encaptest {
	String name ="Cj";
	public static void main(String[] args) {
		//creating an object
		employee emp= new employee();
		emp.setEmpid(101);
		emp.setEmpname("Mr.Cj");
		System.out.println(emp.getEmpid());
		System.out.println(emp.getEmpname());
	}

}          
