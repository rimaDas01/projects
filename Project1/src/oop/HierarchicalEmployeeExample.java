package oop;
class Employee1{
	void hello() {
		System.out.println("Hello Employee");
	}
}
class Manager extends Employee1{
	void helloManager() {
		System.out.println("I am the manager");
	}
}
class PM extends Manager{
	 String details1() {
		return "Rima";
	}
}
class RM extends Manager{
	 String details2() {
		return "Swati is Resource Manager";
	}
}
class HRM extends Manager{
	 String details3() {
		return "Divya Kaushik is HR";
	}
}

public class HierarchicalEmployeeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e = new Employee1();
		e.hello();
	
		Manager m= new Manager();
		e.hello();
		m.helloManager();
		
		PM p = new PM();
	
		p.hello();
		p.helloManager();
		p.details1();
		
		RM r = new RM();
		r.hello();
		r.helloManager();
		r.details2();
		
		HRM hr = new HRM();
		hr.hello();
		hr.helloManager();
		hr.details3();

	}

}
