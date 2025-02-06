package emp1;
class Employee{
	int empId;
	String empName;
	String empDesg;
	static int n =0;
	
	Employee(String empName,String empDesgn){
		this.empId = ++n;
		this.empName = empName;
		this.empDesg = empDesg;
	}
	
	void getEmployeeDetails() {
		System.out.println(empId+" "+empName+" "+empDesg);
	}
	static void showEmployeeCount() {
		System.out.println("No of employees: "+n);
	}
}

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1,e2,e3;
        e1=new Employee("Robert","Resource Manager");
        e2=new Employee("Lilo","Sales Manager");
        e3=new Employee("Donald","HR Manager");
        Employee.showEmployeeCount();
        e1.getEmployeeDetails();
        e2.getEmployeeDetails();
        e3.getEmployeeDetails();

	}

}
