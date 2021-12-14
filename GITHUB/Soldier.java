package GITHUB;
class Commando
{
	Commando(int c)
	{
		super();
			System.out.println("No of cadets in Indian Army");
			System.out.println("Commando-" +c);
	}
}

class Air extends Commando
{
	Air(int a)
	{
		super(25000);
			System.out.println("Air Force-"+a);
	}
}

class Navy extends Air
{
	Navy(int n)
	{
		super(10000);
			System.out.println("Navy-"+n);
			
	}
}



		
	

public class Soldier {

	public static void main(String[] args) {
		
		System.out.println("Start Of Java Code");
		Navy n1=new Navy(5000);
		System.out.println("End Of Java Code");
	}

}
