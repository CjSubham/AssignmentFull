package Final;
//Final method cannot be overridden
//which means even thouth a subclass can call the final method of parent class without any issue
//but it cannot override

class finalmethod{
	//creating final method
	final void finalmethods() {
	 System.out.println("Final method")
	}
}
public class Finalmethodclass extends finalmethod {
	void demo() {
		System.out.println("Final class method");
	}

	public static void main(String[] args) {
		Finalmethodclass fm = new Finalmethodclass();
		//using the subclass I am trying to access parent class
		fm.demo();
		fm.finalmethods();
		//trying to reference parent class for method override
		//parent to parent

		finalmethod nfm = new finalmethod();
		nfm.finalmethods();
		//finalmethod nefm = new Finalmethodclass();
		//nefm.finalmethods();
		
		
		
	}

}
