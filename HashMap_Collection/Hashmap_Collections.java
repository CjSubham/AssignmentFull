package HashMap_Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Hashmap_Collections {

	public static void main(String[] args) {
		//creating an object to make HASH MAP
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		//In order to add element to hmap
		//put<-------add() <-------add()
		//i need to poke hashmapkey in order to get hashmap value
		hmap.put(10, "LL");
		hmap.put(1, "PP");
		hmap.put(4, "JJ");
		hmap.put(3, "VV");
		hmap.put(2, "SS");
		hmap.put(7, "KK");
		System.out.println(hmap);
		
		//Iterator
		//Get and set method
		
		Set value=hmap.entrySet();
		Iterator iterator= value.iterator();
		while(iterator.hasNext()) {
			Map.Entry Mentry = (Map.Entry) iterator.next();
			System.out.println("Key is:  "+Mentry +"Value is: ");
			System.out.println(Mentry.getValue());
		}
		
		System.out.println("Get:   "+ hmap.get(10));
		//remove
		System.out.println("Remove:  "+ hmap.remove(4));
		System.out.println(("Elements after removing"+ hmap));
		System.out.println("Size of hashmap:  "+hmap.size());
		hmap.clear();
		System.out.println("Clearing the hashmap"+hmap);
		
		HashMap<Integer,String> hamap = new HashMap<Integer,String>();
		System.out.println("Sorting the hashmap");
		hamap.put(10, "Subham");
		hamap.put(1, "Bijon");
		hamap.put(5, "Nilima");
		hamap.put(3, "Divya");
		hamap.put(7, "Shraddha");
		System.out.println("Before sorting...." );
		
		Set setmethod = hamap.entrySet();
		Iterator iter = setmethod.iterator();
		while(iter.hasNext()) {
			//create an object to differentiate the keys and value
			Map.Entry me = (Map.Entry)iter.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
		
		Map<Integer,String> map = new TreeMap<Integer, String>(hamap);
		Set setmet = map.entrySet();
		Iterator it = setmet.iterator();
		while(it.hasNext()) {
			//create an object to differentiate the keys and value
			Map.Entry sort = (Map.Entry)it.next();
			System.out.println(sort.getKey());
			System.out.println(sort.getValue());
		}
	}

}
