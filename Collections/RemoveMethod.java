package Collections;

import java.util.ArrayList;

public class RemoveMethod {

	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<String>();
		array.add("AB");
		array.add("CD");
		array.add("EF");
		array.add("GH");
		array.add("IJ");
		array.add("KL");
		System.out.println("Array List before add all"+array);
		for(String var:array) {
			System.out.println(var);
		}
		//we can remove with index as well as obj
		//removing the elements at position 0
		array.remove(0);
		System.out.println(array);
		//removing the elements at position 3
		array.remove(3);
		System.out.println(array);
		//removing the elements at position 2
		array.remove(2);
		System.out.println(array);
		
		//System.out.println("Array list after remove");
		//for(String val:array) {
			//System.out.println(val);
		//}
	}

}
