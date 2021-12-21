package letslearn;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		//Declaring the variable
			int add,sub,mul,div;
			int num_one;
			int num_two;
			int op;
			
			//Dynamic Entry
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your first number: ");
			num_one=sc.nextInt();
			System.out.println("Enter your second number: ");
			num_two=sc.nextInt();
			System.out.println("Enter your Operator: ");
			op=sc.nextInt();
			sc.close();
			
			//Condition statements begins
			if(op == add){
			add= num_one + num_two;
			System.out.println("The addition of two number is"+add );
			}
			else if(op == sub){
			sub= num_two - num_one;
			System.out.println("The substraction of two number is"+sub );	
			}
			else if(op == mul){
			mul= num_two * num_one;
			System.out.println("The multiplication of two number is"+mul );	
			}
			else if(op == div){
				div= num_two / num_one;
				System.out.println("The division of two number is"+div );	
				}
			
		}
	}
