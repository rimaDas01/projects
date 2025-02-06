package oop;
class Emp{
	void work() {    //OVERRIDDEN method
		System.out.println("Employee works!");
	}
	
	void getSal() {
		System.out.println("Employee gets salary!");		
	}
}
class Mgr extends Emp{
	@Override
	void work() {     //OVERRIDING method
		System.out.println("Manager manages resources.");

	}
	void getBonus() {
		System.out.println("Manager gets bonus!");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*new Emp().work();  
		new Mgr().work();*/
		
		/*
		Emp e = new Emp();
		e.work();
		e.getSal();
		Mgr m = new Mgr();
		m.work();
		m.getSal();
		m.getBonus();*/
		
		
		//DYNAMIC METHOD DISPATCH (RUNTIME POLYMORPHISM)
		
		Emp em = new Mgr();  //object upcasting -->EMPs object is assigned to MGR(MGR cannot access its own methods
//		except the overriden ones)
		em.work();   
		em.getSal();	
//		em.getBonus(); //ERROR
		((Mgr)em).getBonus(); //downcasting-->(manager using Parents object)converting Emps object to Manger downward 
		//so downcasting

	}

}
