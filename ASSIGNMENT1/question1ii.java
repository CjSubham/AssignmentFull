package ASSIGNMENT1;
import java.util.Scanner;
public class question1ii {

	public static void main(String[] args) {
		int number_1, number_2, multiply;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number: ");
		number_1=sc.nextInt();
		System.out.println("Enter your second number: ");
		number_2=sc.nextInt();
		sc.close();
		multiply = number_1 * number_2;
		System.out.println("The output of the multiply is---->" +multiply);

	}

}
