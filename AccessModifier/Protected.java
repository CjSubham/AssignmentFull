package AccessModifier;
//Protected access modifiers
//protected modifiers allows the access of protected members in sub classes in any package
//protected can be used to access the data members from another package
public class Protected {
	protected int add(int number_one, int number_two) {
		return number_one + number_two; 
	}
	
	public static void main(String[] args) {
		System.out.println("This is protected access specifier");

	}

}
