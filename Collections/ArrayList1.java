package Collections;
import java.util.ArrayList;
import java.util.List;
public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> array=new ArrayList<Integer>();
		array.add(10);
		array.add(20);
		array.add(30);
		array.add(40);
		System.out.println("Before====>"+array);
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(50);
		list.add(60);
		list.add(70);
		
		array.addAll(list);
		
		//array.addAll(2,list);
		System.out.println("After  "+array);
		
		
		
		
		
		
	}

}
