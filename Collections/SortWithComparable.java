package Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
 class Student{
	private String Name;
	private int RollNo;
	private int Age;
	
	public Student(String name, int rollNo, int age) {
		
		this.Name = name;
		this.RollNo = rollNo;
		this.Age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	//we need to comparte method explicitely to accomplish the sort mechanism
	public int compare to(Student comparestu) {
	int compareage=((Student)comparestu).getAge();
	return this.Age-compareage;
	}
}        

public class SortWithComparable {

	public static void main(String[] args) {
		ArrayList<Student> Array =new ArrayList<Student>();
		Array.add(new Student("Subham",222,28));
		Array.add(new Student("Subham",222,28));
		Array.add(new Student("Subham",222,28));
		Array.add(new Student("Subham",222,28));
		Array.add(new Student("Subham",222,28));
		Collections.sort(Array);
		for(Student str:Array) {
			System.out.println(str);
		}
	}

}
