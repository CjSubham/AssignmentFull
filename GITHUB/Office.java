package GITHUB;
class offices
{
	void building()
	{
		System.out.println("No Of Floors");
	}
}
class cubicles extends  offices
{
	void myplace()
	{
		System.out.println("I am sitting in 3rd Row 4th Column");
	}
}
class cafeteria extends offices
{
void canteen()
	{
	System.out.println("You can eat and relax in your free time");
	}
}

	
public class Office {

	public static void main(String[] args) {

		System.out.println("Start Of Java Code");

		

		cubicles cu=new cubicles();
		cu.building();
		cu.myplace();
		

		cafeteria c=new cafeteria();
		c.building();
		c.canteen();
		
		
		System.out.println("End Of Java Code");

	}

}
