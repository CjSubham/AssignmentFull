package letslearn;
import java.util.Scanner;
public class ConditionalOperators {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number: ");
		num=sc.nextInt();
		sc.close();
		if(num % 2 == 0) {
		System.out.println("The number is Even");
		}
		else {
			System.out.println("The number is Odd");
		}
		
		
	}

}
