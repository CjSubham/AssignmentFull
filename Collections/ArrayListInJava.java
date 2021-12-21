package Collections;
import java.util.ArrayList;
public class ArrayListInJava {

	public static void main(String[] args) {
		//we had created an array list
		ArrayList<String> names = new ArrayList<String>();
		//add an elements to the array list
		//inbuild method and i.e add(); This will take one parametres only <Int,string>
		names.add("Subham");//<========0
		names.add("JAVA");//<==========1
		names.add("Programming");//<===2
		names.add("Rourkela");//<======3
		names.add("Mr. CJ");//<========4
		//Displaying the array element 
		System.out.println("Array elements are--->"+names);
		//if u want any elements at any place of position but it should be within the array itself
		names.add(5, "Mobile");
		System.out.println("New element added"+names);
		names.remove(4);
		System.out.println("List after removing");
		System.out.println(names);
		System.out.println("Names present at zero position");
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		System.out.println(names.get(3));
		System.out.println(names.get(4));
		//loops:for loop,for each
		System.out.println("This is from for loop");
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
			System.out.println("Foreach loop");
		for(String object : names)
			System.out.println(object);
		}
		
	}

}
