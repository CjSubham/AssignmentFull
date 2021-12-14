package GITHUB;

class Room
{
	String areaToStay="Rourkela";
	int noOfpersons=2;
	String aadharcard="846120111272";
	int monthlyRoomRent=2000;

	void search()
	{
		System.out.println("Searching for affordable rooms in your area");
	}
	
}
class RoomV2 extends Room
{
	
	void helpline()
	{
			System.out.println("Customer Help Support No- 1800 456 789");
	}	
}


		
	
public class OYO {

	public static void main(String[] args) {
		System.out.println("Create account and login for affordable rooms");
		RoomV2 r=new RoomV2();
		
		
		
		System.out.println("areaTo Stay="+r.areaToStay);
		System.out.println("noOfpersons="+r.noOfpersons);
		System.out.println("aadharcard="+r.aadharcard);
		System.out.println("Monthly Room Rent="+r.monthlyRoomRent);
		
		r.search();
		r.helpline();
		System.out.println("Go and visit your room");	

	}

}
