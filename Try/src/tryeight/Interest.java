package tryeight;

/* Find the simple interest when Principal=1500, rate= 5%, time=2years
	formula for simple interest
	SimpleInterest = Principal*rate*time/100*/

public class Interest {
	//main method
	public static void main (String[] args) {
		//principal is calculated in Rs.
		float principal = 2000.05f;
		int rate = 5; // rate is calculated in %
		int time = 3; //time is calculated in years
		double simpleInterest = (principal*rate*time)/100;
		
		System.out.println("Simple Interest = Rs. " +simpleInterest);
		
	}
}
