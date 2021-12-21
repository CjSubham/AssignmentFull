 package Collections;
import java.util.ArrayList;
import java.util.Collections;

class Studentts{
	int rollNo;
	String name;
	int age;
	public Studentts(int rollNo, String name, int age) {
	
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	
}

public class Comparable {

	public static void main(String[] args) {
		ArrayList<Studentts> stu = new ArrayList<Studentts>(); 
		stu.add(new Studentts(101,"Subham",23));
		stu.add(new Studentts(35,"Mr. Cj",24));
		stu.add(new Studentts(05,"Divu",22));
		
		Collections.sort(stu);
		for(Studentts counter:stu ) {
			System.out.println(counter.rollNo+""+counter.name+""+counter.age);
		}
		
		
		
	}

}
