package letslearn;
public class staticcalculator {

	public static void main(String[] args) {
		
		//Declaration of variable
		int add,sub,mul,div;
		int num_one=5;
		int num_two=10;
		String  op="sub";
		
				
		//Condition statements begins
		if(op == "add"){
		add= num_one + num_two;
		System.out.println("The addition of two number is:  "+add );
		}
		else if(op == "sub"){
		sub= num_two - num_one;
		System.out.println("The substraction of two number is: "+sub );	
		}
		else if(op == "mul"){
		mul= num_two * num_one;
		System.out.println("The multiplication of two number is: "+mul );	
		}
		else if(op == "div"){
			div= num_two / num_one;
			System.out.println("The division of two number is: "+div );	
			}
		

	}

}
