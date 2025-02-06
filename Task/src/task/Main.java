package task;

class Employee{
	void work() {
		
	}
}
class Manager extends Employee{
	void manageResource() {
		
	}
}
class SalesExecutive extends Employee{
	void saleProduct() {
		
	}
}
class HRManager extends Employee{
	void manageHR() {
		
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee();
		Manager emp2= new Manager();
		SalesExecutive emp3= new SalesExecutive();
		HRManager emp4 = new HRManager();
		emp1.work();
		emp2.manageResource();
		emp3.saleProduct();
		emp4.manageHR();

	}

}
