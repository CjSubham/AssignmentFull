package GITHUB;
class name
{
	String n;
	
	name()
	{
		System.out.println("My Name is");
		n="Subham Lahiry Majumdar"; 
	}
}
class age
{
	int a;

	age()
	{
		System.out.println("My age  is");
		a=23; 
	}
}
class Weight
{
	int w;
	
	Weight()
	{
		System.out.println("Weight of my body is");
		w=65; 
	}
}
class Height
{
	
	float h;

		Height()
	{
		System.out.println("Height of my body is");
		h=5.8f; 
	}
}
class Gender
{
		String g;

	Gender()
	{
		System.out.println("Weight of my body is");
		g="Male"; 
	}
}

	
		public class Bio {

	public static void main(String[] args) {
		
		name n1=new name();
		System.out.println("Name="+n1.n);

		age a1=new age();
		System.out.println("Age="+a1.a);

		Weight w1=new Weight();
		System.out.println("Weight="+w1.w);

		Height h1=new Height();
		System.out.println("Height="+h1.h);

		Gender g1=new Gender();
		System.out.println("Gender="+g1.g);

		System.out.println("End Of Java Code");


	}

}
