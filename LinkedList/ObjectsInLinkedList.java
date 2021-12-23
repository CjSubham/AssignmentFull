package LinkedList;

import java.util.LinkedList;

public class ObjectsInLinkedList {

	public static void main(String[] args) {
		//create an object to have linked list
		LinkedList<String> obj = new LinkedList<String>();
		obj.add("Item 1");
		obj.add("Item 3");
		obj.add("Item 5");
		obj.add("Item 6");
		obj.add("Item 2");
		obj.add("Item 4");
		System.out.println(obj);
		
		obj.addFirst("First");
		obj.addLast("Last");
		System.out.println(obj);
		
		//get and set the values
		Object firstvar = obj.get(0);
		System.out.println("CJ====>"+ firstvar);
		obj.set(0, "Subham");
		System.out.println(obj);
		obj.clear();
		System.out.println("Cleared"+obj);
	}

}
