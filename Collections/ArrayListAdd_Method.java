package Collections;

import java.util.ArrayList;

public class ArrayListAdd_Method {

	public static void main(String[] args) {
		ArrayList<Object> array_str=new ArrayList<Object>();
		array_str.add("Wipro");
		array_str.add("Capgemini");
		array_str.add("Infosys");
		array_str.add("TechM");
		System.out.println("Elements of array_str: "+array_str);
		//Create anothe array
		ArrayList<Integer> array_int=new ArrayList<Integer>();
		array_int.add(10);
		array_int.add(20);
		array_int.add(30);
		array_int.add(40);
		System.out.println("Elements of array_str: "+array_int);
		array_str.addAll(array_int);
		System.out.println("Elements after adding the string type and string Integer"+array_str);
	}

}
