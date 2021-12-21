package Final;
//final variable are nothing but constants.
//Constants----whose values are not changeble
class finalclass{
 final int value;
	//constructor
 finalclass(){
		value=101; 
 }
	void demo() {
	
		System.out.println(value);
	}
}
public class Finalkeyword {

	public static void main(String[] args) {
		finalclass fc= new finalclass();
		System.out.println(fc.value);
		fc.demo();
	}

}
