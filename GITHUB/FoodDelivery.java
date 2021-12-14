package GITHUB;
class zomato
{
	void fooddelivery()
	{
		System.out.println("Available to 50+ cities");
	}
}
class time extends zomato
{
	void approxtime()
	{
		System.out.println("Atleast 30 minutes time taken");
	}
}
class menu extends zomato
{
void order()
	{
	System.out.println("Please select your order");
	}
}

			
public class FoodDelivery {

	public static void main(String[] args) {
System.out.println("Start Of Java Code");

		

		time t=new time();
		t.fooddelivery();
		t.approxtime();
		

	    menu m=new menu();
		m.fooddelivery();
		m.order();
		
		
		System.out.println("End Of Java Code");
	

	}

}
