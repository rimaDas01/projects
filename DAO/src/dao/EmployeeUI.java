package dao;

import java.util.Scanner;

public class EmployeeUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeServiceDaoImpl service = new EmployeeServiceDaoImpl();
		Scanner sc= new Scanner(System.in);
		
//		EmployeeDaoImpl impl = new EmployeeDaoImpl();
//		Employee e1 = new Employee(101,"Rima");
//		Employee e2 = new Employee(102,"Robert");
//		Employee e3 = new Employee(103,"Roger");
//		Employee e4 = new Employee(303,"Charlie");
//		Employee e5 = new Employee(304,"Candy");
		

//		impl.showAllEmployees();
		
//		EmployeeDaoImpl impl = new EmployeeDaoImpl();
		
		
//		int empId; 
//		String empName,empDesignation;
		do {
			System.out.println("\nEnter a choice:\n 1 to add new\n 2 to show all details\n 3 to edit details\n 4 to search\n 5 to delete");
			int choice= sc.nextInt();
		
		switch(choice) {
		case 1:
			
			/*System.out.println("Enter ID: ");
			empId= sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Employee Name: ");
			empName=sc.nextLine();
			
			System.out.println("Enter designation: ");
			empDesignation = sc.nextLine();
			
			Employee e = new Employee(empId,empName,empDesignation);
			impl.addEmployee(e);*/
			service.add();
			break;
			
		case 2:	

//			impl.showAllEmployees();
			service.showAll();
			break;
			
		case 3: 
			/*System.out.println("Enter ID: ");
			empId= sc.nextInt();
			sc.nextLine();
			System.out.println("Enter designation: ");
			empDesignation = sc.nextLine();
			impl.showEmpDesignation(empId, empDesignation);*/
			service.edit();
			break;
			
		case 4:
			/*System.out.println("Enter ID: ");
			empId= sc.nextInt();
			impl.searchEmployee(empId);*/
			service.search();
			break;
			
		case 5:
			/*System.out.println("Enter ID: ");
			empId= sc.nextInt();
			impl.deleteEmployee(empId);*/
			service.delete();
			break;
			
		case 6: 
			System.out.println("Bye..");
			System.exit(0);
			
		default: 
				System.out.println("Not a valid choice!");
		}
		
		}while(true);
	}

}
