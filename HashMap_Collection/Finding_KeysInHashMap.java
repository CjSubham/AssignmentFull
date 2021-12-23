package HashMap_Collection;

import java.util.HashMap;

public class Finding_KeysInHashMap {

	public static void main(String[] args) {
		//check if a particular key exist in hashmap...
		//create a hashmap object
		HashMap <Integer, String> sports = new HashMap <Integer, String>();
		//adding element
		sports.put(11, "Cricket");
		sports.put(12, "Football");
		sports.put(13, "Baseball");
		sports.put(14, "Hockey");
		sports.put(15, "Rugby");
		
		//checking key existance
		//whether 11 is present
		boolean variable = sports.containsKey(11);
		System.out.println(variable);
		//whether 12 is present
		boolean var = sports.containsKey(12);
		System.out.println(var);
		//whether 13 is present
		boolean varia = sports.containsKey(15);
		System.out.println(varia);
		
		//checking value existance
		//boolean variable = sports.containsKey(11);
		System.out.println(sports.containsValue("Cricket"));
		//whether 12 is present
		//boolean var = sports.containsKey(12);
		System.out.println(sports.containsValue("Hockey"));
		//whether 13 is present
		//boolean varia = sports.containsKey(15);
		System.out.println(sports.containsValue("Derby"));
	}

}
