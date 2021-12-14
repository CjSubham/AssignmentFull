package GITHUB;

class MilkyMoo
{
	float noOfLitres=1.5f;
	long pincode=770033;
	String address="Contractor Para, Birmitrapur, Sundargarh, Odisha";
	String avgTimeTaken="1hour";

	void takeorder()
	{
		System.out.println("Take The Order");
	}
	void delivery()
	{
		System.out.println("Get Out For Delhivery");
	}
}
class MilkyMooV2 extends MilkyMoo
{
	
	void otp()
	{
			System.out.println("Send The Delivery OTP To  The Customer For Tracking About The Order");
	}	
}


		
	
public class MilkDelivery {

	public static void main(String[] args) {
		
		System.out.println("Create account and login for ordering");
		MilkyMooV2 mm=new MilkyMooV2();
		
		mm.takeorder();
		
		System.out.println("No Of Litres="+mm.noOfLitres);
		System.out.println("Please Enter Your Area Pindode="+mm.pincode);
		System.out.println("Your Home Address="+mm.address);
		System.out.println("Approximate Time Taken="+mm.avgTimeTaken);
		
		mm.delivery();
		mm.otp();
		System.out.println("Your Order is on the way, Please be patient");
	}

}
