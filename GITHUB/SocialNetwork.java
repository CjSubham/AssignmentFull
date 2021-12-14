package GITHUB;
class SocialV1
{
	String app="FACEBOOK";
	void socialnetwork()
	{
		System.out.println("Helps to connect with friends");
	}
}
class SocialV2 extends SocialV1
{
	void username()
	{
		System.out.println("Please enter your username");
	}
}
class SocialV3 extends SocialV2
{
	void password()
	{
		System.out.println("Please enter your password");
	}
}
class SocialV4 extends SocialV3
{
	void login()
	{
		System.out.println("Click here to signin");
	}
}


		

public class SocialNetwork {

	public static void main(String[] args) {
		System.out.println("Start Of Java Code");

		SocialV4 s4=new SocialV4();
		System.out.println("Name of the app-"+s4.app);
		s4.socialnetwork();
		s4.username();
		s4.password();
		s4.login();
		
		System.out.println("End Of Java Code");

	}

}
