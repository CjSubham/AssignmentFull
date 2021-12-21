package Collections;

import java.util.ArrayList;

public class CopyingArrayAtPosition {

	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<String>();
		array.add("A");
		array.add("B");
		array.add("C");
		array.add("D");
		System.out.println("Array List before add all"+array);
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("E");
		arr.add("F");
		arr.add("G");
		arr.add("H");
		System.out.println("Array List 2 before addall"+arr);
		//adding the array list
		
		array.addAll(4, arr);
		System.out.println("Adding the elements"+array);
		arr.addAll(0, array);
		System.out.println("Array list"+arr);
	}

}
