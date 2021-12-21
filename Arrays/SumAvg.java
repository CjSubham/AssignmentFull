package Arrays;

public class SumAvg {

	public static void main(String[] args) {
		int cj[]= {42,13,19,32,100};
		int sum=0;
		double avg=0;
		
		for(int i=0;i<cj.length;i++) {
			sum+=cj[i];
			avg=sum/cjlength;
		}
		
		
			System.out.println("The sum of the ages are "+ sum );
			System.out.println("The avg of the ages are "+ avg );

	}

}
