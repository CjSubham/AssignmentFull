package Collections_ArrayList;

import java.util.ArrayList;

public class ArrayListCompare {

	public static void main(String[] args) {
		ArrayList<String> array_one =new ArrayList<String>(); 
		array_one.add("Hii");
		array_one.add("Good");
		array_one.add("After");
		array_one.add("Noon");
		array_one.add("Thanks For Lunch");
		
		ArrayList<String> array_two =new ArrayList<String>();
		array_two.add("Hii");
		array_two.add("Good");
		array_two.add("After");
		array_two.add("Noon");
		array_two.add("Thanks For Lunch");
		
		ArrayList<String> array_comp =new ArrayList<String>();
		//loop
				for(String temp:array_one) {
					//compare>> true || false
					array_comp.add(array_two.contains(temp)?"Yes":"No");
					System.out.println(array_comp);
				}
	}

}
