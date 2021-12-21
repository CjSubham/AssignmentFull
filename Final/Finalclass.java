package Final;
//we cannot extends a final class
// a constructor cannot be declared as a final
//local variable must be iniatializing during declaration
//all variable declared in an interface are by default final
//we cannot change the value of a final variable
//a final method cannot be override
//a final method cannot be inherited
//if method parametres are declared final then the values of these parametres cannot be changed
//it is a good practice to name final variables in all caps
//final,finally,finalize are three
//fINALLY USED IN EXCEPTION HANDLING
//FINALIZE IS A METHOD CALLED BY jvm DURING GARBAGE COLLECTION
public class Finalclass {
}
public class FinallClass extends Finalclass{
	void method() {
		System.out.println("SUBCLASS METHOD");
	}
	public static void main(String[] args) {
	FinallClass fc = new FinallClass();
	fc.method();

	}

}
