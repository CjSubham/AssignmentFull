package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class SubListFromLinkedList {

	public static void main(String[] args) {
		//linkedlist and its sublist
		//create an object for linkedlist
		LinkedList<String> gc = new LinkedList<String>();
		gc.add("Rice");//0
		gc.add("oil");//1
		gc.add("dal");//2
		gc.add("soap");//3
		gc.add("shampoo");//4
		gc.add("salt");//5
		gc.add("sugar");//6
		System.out.println(gc);
		//loop===>iterator
		Iterator<String> iter = gc.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		//obtaining sublist fom the [groceries]
		List<String> Anything = gc.subList(2, 6);
		System.out.println(Anything);
	}

}

