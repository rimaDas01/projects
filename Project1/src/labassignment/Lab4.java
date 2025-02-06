package labassignment;

class Employee{
	private int id= 200;
	private String name="Radhe Radhe";
	private double basicSal=89000;
	final int TA=2000;
	double hra= basicSal*0.05;
	double da=basicSal*0.027;
	double med=basicSal*0.015;
	double gross = basicSal+da+TA+hra;
	double pt = 0.10*gross;
	double pf = 0.25*gross;
	double netSal = gross-pt-pf;
	
	void grossSal() {
		System.out.println("Gross is= Rs."+gross);				
	}
	void netSal() {
		System.out.println("Net Salary of "+name+" is = Rs. "+netSal);				

	}
}



public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.grossSal();
		e.netSal();
		
	}

}
