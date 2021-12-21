package Collections_ArrayList_Others;

import java.util.ArrayList;

import java.util.Collections;

public class Swapping_Array_List {

	public static void main(String[] args) {
		//creating array list
		ArrayList<String> names =new ArrayList<String>();
		names.add("Sachin");
		names.add("Sourav");
		names.add("Rahul");
		names.add("Yuvraj");
		names.add("Laxman");
		names.add("Kaif");
		
		System.out.println("Array List Before Swap");
		
		for(String temp:names) {
			System.out.println(temp);
		}
		//swapping can be done all together or anyone
		//swapping 2nd element (index 1) element with 5th elements (index 4)
		//there are inbuilt methods available as SWAP in collections.
		Collections.swap(names, 2, 5);
		System.out.println("Array List After swap ");
		for(String temp : names) {
		System.out.println(temp);
		}

	}

}
