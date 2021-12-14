package GITHUB;
class irctc
{
	void pnr(long pnrno)
	{
		System.out.println("Please check your train PNR no to check for confirmation");
	}
	void login(String  username,String password)
	{
		System.out.println("Please enter your username and password to login");
	}
	void search(String trainName ,long trainno)
	{
		System.out.println("sending message to 5  people");
	}
}

		
	
public class TrainTicket {

	public static void main(String[] args) {
		System.out.println("Start Of Java Code");

		irctc i=new irctc();
		i.login("Cj_Subham","123@sub");
		i.search("Rajdhani Express",123456L);
		i.pnr(1234567891L);

		System.out.println("End Of Java Code");

	}

}
