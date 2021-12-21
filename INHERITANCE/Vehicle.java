package INHERITANCE;
//Base class
 class Vehicle {
String brand= "Ford";
public void engine() {
	System.out.println("Ford has a smooth engine");
}

		
	public static void main(String[] args) {
		System.out.println("Hello world");
		Car mycar = new Car();
		mycar.engine();
		System.out.println(mycar.brand+""+mycar);

	}

}
 //Chlid/Derived/subclass
class Car extends Vehicle{
	String modelname="Ecosport";
}