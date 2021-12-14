package GITHUB;
class instagram
{
	void login(String username,String password)
	{
		System.out.println("Username="+username);
		System.out.println("Password="+password);
	}
	void login(long mobileno,String password)
	{
		System.out.println("Enter your Mobile Number="+mobileno);
		System.out.println("Password="+password);
	}
}

		
	
public class Insta {

	public static void main(String[] args) {
		System.out.println("Start Of Java Code");

		instagram insta=new instagram();
		insta.login("Cj_Subham","9876543210");
		insta.login(8249468829L,"123456789");

		System.out.println("End Of Java Code");

	}

}
