package letslearn;

public class bitwiseoperator {

	public static void main(String[] args) {
		int bit_one=12;
		int result;
		
		result=bit_one<<3;
		System.out.println("Bitwise left shift operator performed, the output is "+ result);

		result=bit_one>>3;
		System.out.println("Bitwise right shift operator performed, the output is "+ result);
		
		int bit_two=14;
		
		
		result=bit_two<<4;
		System.out.println("Bitwise left shift operator performed, the output is "+ result);

		result=bit_two>>4;
		System.out.println("Bitwise right shift operator performed, the output is "+ result);

int numone,numtwo;
numone=30;
numtwo=(numone == 2)? 100:200;
System.out.println(numtwo);


	}

}
