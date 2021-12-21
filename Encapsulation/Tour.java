package Encapsulation;

class travel{
	private String name;
	private int noOfPassenger;
	private String Destination;
	private String DOJ;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfPassenger() {
		return noOfPassenger;
	}
	public void setNoOfPassenger(int noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public String getDOJ() {
		return DOJ;
	}
	public void setDOJ(String dOJ) {
		DOJ = dOJ;
	}
	public void setDOJ(int i) {
		// TODO Auto-generated method stub
		
	}
	
}

public class Tour {

	public static void main(String[] args) {
		travel trav= new travel();
		trav.setName("SUBHAM");
		trav.setDestination("KOLKATA");
		trav.setNoOfPassenger(2);
		trav.setDOJ("01/01/2022");
		
		System.out.println("Name of the passenger=====>"+trav.getName());
		System.out.println("Destinationn place========>"+trav.getDestination());
		System.out.println("No. of passenger==========>"+trav.getNoOfPassenger());
		System.out.println("Date Of Journey===========>"+trav.getDOJ());
		

	}

}
     