package Collections;
import java.util.ArrayList;
import java.util.List;
public class CopyArrayList {

	public static void main(String[] args) {
		//create arraylist
		ArrayList<String> array=new ArrayList<String>();
		//add elements
		array.add("Programming");
		array.add("Is");
		array.add("Fun");
		System.out.println("First array list:"+array);
		//To perform array list copy we need anothe array list
		//I am calling list of collections
		List<String> list = new ArrayList<String>();
		//adding elements to the list
		list.add("Subham");
		list.add("Technical");
		list.add("Coder");
		//adding all the elements of list to array list<======Array list copy
		//java do have inbuilt add() ===> addAll()
		array.addAll(list);
		array.addAll(2,list);
		System.out.println("Updated elements  "+array);
	}

}
