package Collections_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListSynchronized {

	public static void main(String[] args) {
		//creating arraylist
		//ArrayList<String> sync_coll = (ArrayList<String>) Collections.synchronizedList(new ArrayList<String>()); 
		//Inorder to synchronize the ArrayList
		//The best practice is make use of List instead of array list
		List<String> sync_col = Collections.synchronizedList(new ArrayList<String>());
		//Adding an elements to sync ArrayList
		sync_col.add("Phone");
		sync_col.add("Mobile");
		sync_col.add("Laptop");
		
		System.out.println("Iterating sync arraylist");
		synchronized(sync_col) {
		//We will use one  more collection type : Iterator
			Iterator<String> iterator = sync_col.iterator();
			while(iterator.hasNext())
				System.out.println(iterator.next());
		}
		
		
	}

}
