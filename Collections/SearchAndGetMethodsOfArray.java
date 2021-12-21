package Collections;

import java.util.ArrayList;

public class SearchAndGetMethodsOfArray {

	public static void main(String[] args) {
		ArrayList<Integer> array_int=new ArrayList<Integer>();
		array_int.add(1);
		array_int.add(11);
		array_int.add(22);
		array_int.add(33);
		array_int.add(99);
		array_int.add(111);
		array_int.add(88);
		array_int.add(66);
		//First Index of element <---- Inbuilt method i.e lasstIndex of
		System.out.println("First occurance the element1 "+array_int.lastIndexOf(1));
		System.out.println("First occurance the element1 "+array_int.lastIndexOf(11));
		System.out.println("First occurance the element1 "+array_int.lastIndexOf(22));
		System.out.println("First occurance the element1 "+array_int.lastIndexOf(33));
		System.out.println("First occurance the element1 "+array_int.lastIndexOf(99));

	}

}
