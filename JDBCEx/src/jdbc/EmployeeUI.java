package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class EmployeeUI {



   public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        EmployeeDAOImpl impl=new EmployeeDAOImpl();
        Employee emp = new Employee();
        do {
                System.out.println("1 to Add\n2 to Show\n3 to Update\n4 to delete");
                System.out.println("Enter your choice : ");
                int ch=sc.nextInt();
                switch(ch) {
                case 1:
                	
                	impl.addEmployee(emp);
                    
                    break;
                case 2:
                	
                    impl.showAllEmployeeDetails();
                    break;
                case 3:
//                	System.out.println("Updated successfully!");
                	impl.update();
                	break;
                case 4:
                	impl.deleteEmployee();
                	break;
                  default:
                    	System.out.println("Invalid choice");
                }
                
            
            }while(true);

   }

}