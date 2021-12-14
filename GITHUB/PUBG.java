package GITHUB;
class pubgV1
{
	String size="1.2gb";
	void battleroyale()
	{
		System.out.println("Winner Winner Chicken DInner");
	}
}
class pubgV2 extends pubgV1
{
	String size1="1.8gb";
	void guns()
	{
		System.out.println("New guns updated");
	}
}
class pubgV3 extends pubgV2
{
	String size2="2.4gb";
	void vehicles()
	{
		System.out.println("Dacia and Buggy are added");
	}
}
class bgmi extends pubgV3
{
	String size3="703mb";
	String serverlocation="India";
	
	void rules()
	{
		System.out.println("The game is now non-violent and is under the Indian govt rules and regulations.");
	}
}



	
public class PUBG {

	public static void main(String[] args) {
		System.out.println("Start Of Java Code");

		bgmi b=new bgmi();

		System.out.println("Size="+b.size);
		b.battleroyale();

		System.out.println("Size="+b.size1);
		b.guns();

		System.out.println("Size="+b.size2);
		b.vehicles();

		System.out.println("New Size="+b.size3);
		System.out.println("Server Location="+b.serverlocation);
		b.rules();

		

		System.out.println("End Of Java Code");

	}

}
