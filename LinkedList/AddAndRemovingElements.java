package LinkedList;

import java.util.LinkedList;

public class AddAndRemovingElements {

	public static void main(String[] args) {
		//create an object to have linked list
		LinkedList<String> obj = new LinkedList<String>();
		obj.add("Rourkela");
		obj.add("Birmitrapur");
		obj.add("Barbil");
		obj.add("Chennai");
		obj.add("Kolkata");
		//removing the elments
		//as same as remove methods
		
		obj.remove();
		System.out.println(obj);
		obj.removeFirst();
		System.out.println(obj);
		obj.removeFirstOccurrence(obj);
		System.out.println(obj);
	

	}

}
