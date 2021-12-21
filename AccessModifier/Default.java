package AccessModifier;



public class Default {
	
	int addtwomethods(int a, int b){
		return a+b;
	}
	int addtwo(int one, int two) {
		return one+two;
	}

	public static void main(String[] args) {
		//we need to create an object
		Default obj = new Default();
		obj.addtwomethods(10, 20);
		obj.addtwo(50, 100);
		System.out.println(obj.addtwomethods(10, 20));
		System.out.println(obj.addtwo(50, 100));
	}

}
