package LinkedList;

import java.util.LinkedList;

public class GetElementsByIndex {

	public static void main(String[] args) {
		//creating an object with linked list
		LinkedList<String> ll = new LinkedList<String>();
		//population linked list with a string values
		ll.add("AA");
		ll.add("BB");
		ll.add("CC");
		ll.add("DD");
		ll.add("EE");
		System.out.println(ll);
		//In would know the index position of the elements
		System.out.println("Linked List Elements: ");
		//get index
		for(int i=0;i<ll.size();i++)
			System.out.println("Elements at index==>  "+ i + "  is:  " + ll.get(i));
			//search first occurance
		int firstindex = ll.indexOf("BB");
		System.out.println(firstindex);
		
	}

}
