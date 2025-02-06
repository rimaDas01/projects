package oop;

class Employee2{
	double sal,bonus;
}

class Manager2 extends Employee2{
	double perks;
	Manager2(){
		sal = 25000;
	}
}
class SalesExecutive extends Employee2{
	double incentives;
	SalesExecutive(){
		sal=39000;
	}
}
class PayRoll{
	public static void calculate(Employee2 e) {
		if(e instanceof Manager2) {
			e.bonus=e.sal*0.75;
			((Manager2) e).perks= e.sal*.02;   //downcast
			System.out.println(e.sal+" , "+e.bonus+" , "+((Manager2) e).perks);
		
		}
		if(e instanceof SalesExecutive) {
			e.bonus=e.sal*0.50;
			((SalesExecutive) e).incentives=e.sal*.05;
			System.out.println(e.sal+" , "+e.bonus+" , "+((SalesExecutive) e).incentives);
		}		

	}
}
public class MethodOverridingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee2 emp = new Employee2();
//		Employee2 emp = new Manager2();
//		Employee2 emp = new SalesExecutive();
		Manager2 emp = new Manager2();
//		SalesExecutive emp = new SalesExecutive();
		PayRoll.calculate(emp);		
;
	}

}
