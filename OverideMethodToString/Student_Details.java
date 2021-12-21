package OverideMethodToString;
import java.util.ArrayList;
public class Student_Details {

	public static void main(String[] args) {
	//in order to store the student details
	//I will go ahead and create array list
		ArrayList<Student> stu = new ArrayList<Student>();
		//Note:--- Whenever we dealing with the constructor make sure we create an object
		//		   The array list should be pointing to classname if the constructor is present in another class
		stu.add(new Student("Subham",23,"Rourkela"));
		stu.add(new Student("Saurav",45,"KOL"));
		stu.add(new Student("Rahul",40,"Indore"));
		stu.add(new Student("Yuvraj",39,"Chandigarh"));
		stu.add(new Student("Laxman",46,"Hyderabad"));
		stu.add(new Student("Shewag",52,"Delhi"));
		stu.add(new Student("Kaif",49,"Allahbad"));
		
		//loop====>Iterate over the array elements
		for(Student details:stu) {
			System.out.println(details);	
		}
	}

}
