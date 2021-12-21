package AccessModifier;
//the scope of private modifier is limited to class only
//1. private data menmers and methods are only accessible within the class
//2. class and interface cannot be declared as private
//3. if a aclass have a private constructor then oyu cannot create a the object of the class from outside of the class
class privateclass{
 private double sum=100;
	//method
	private int square(int num) {
		return num*num;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	
}
public class Private {

	public static void main(String[] args) {
		privateclass pc = new privateclass();
		pc.setSum(100);
		System.out.println(pc.getSum());


	}

}
