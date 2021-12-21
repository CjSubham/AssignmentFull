package Collections;
import java.util.ArrayList;
import java.util.Collections;
public class AdvancePractice {
//writing a java program to create a brand new array list using loop
//sorting of arraylist<string>	
	
	
	public static void main(String[] args) {
		//we have created an array obj to store List of countries
		ArrayList<String> LOC = new ArrayList<String>();
		LOC.add("India");
		LOC.add("USA");
		LOC.add("China");
		LOC.add("France");
		
		//Unsorted List
		System.out.println("Arrays before sorting");
		for(String counter:LOC) {
			System.out.println(counter);
		}
		//reverse sorting====>Collection.reverseOrder()
		//Sorted List
		Collections.sort(LOC,Collections.reverseOrder());
		System.out.println("Arrays after sorting");
		for(String counter:LOC) {
			System.out.println(counter);
		}
	}

}
