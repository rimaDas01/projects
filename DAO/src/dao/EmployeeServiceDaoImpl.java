package dao;

import java.util.Scanner;

public class EmployeeServiceDaoImpl implements EmployeeServiceDAO {

	EmployeeDaoImpl impl = new EmployeeDaoImpl();
	Scanner sc =  new Scanner(System.in); 
	
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Enter ID: ");
		int empId= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Employee Name: ");
		String empName=sc.nextLine();
		
		System.out.println("Enter designation: ");
		String empDesignation = sc.nextLine();
		
		Employee e = new Employee(empId,empName,empDesignation);
		impl.addEmployee(e);
		
	}

	@Override
	public void showAll() {
		// TODO Auto-generated method stub
		
		impl.showAllEmployees();
		
	}

	@Override
	public void edit() {
		// TODO Auto-generated method stub
		System.out.println("Enter ID: ");
		int empId= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter designation: ");
		String empDesignation = sc.nextLine();
		impl.showEmpDesignation(empId, empDesignation);
		
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.println("Enter ID: ");
		int empId= sc.nextInt();
		impl.searchEmployee(empId);
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Enter ID: ");
		int empId= sc.nextInt();
		impl.deleteEmployee(empId);
		
	}

}
