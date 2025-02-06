package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeDAOImpl implements EmployeeDAO {
	
    
    Scanner sc=new Scanner(System.in);
    String driver="com.mysql.cj.jdbc.Driver";
    String dburl="jdbc:mysql://localhost:3306/office";
    String user="root";
    String password="root";
    
	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		try {
            // load the driver
            Class.forName(driver);
            
            //create the connection
            Connection con= DriverManager.getConnection(dburl,user,password);
            
            //Write and Execute query
            Statement st=con.createStatement();
            
            
            int id;
            String name;
            double salary;
            String designation;
            System.out.println("Enter id number : ");
            id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name : ");
            name=sc.nextLine();
        
            System.out.println("Enter salary : ");
            salary=sc.nextDouble();
        
            sc.nextLine();
            System.out.println("Enter designation : ");
            designation=sc.nextLine();
        
            String sql="insert into employee values("+id+",'"+name+"',"+salary+",'"+designation+"')";
            int n=st.executeUpdate(sql);
            
//        	System.out.println("Employee added.");

        	
          
		}
		catch(ClassNotFoundException | SQLException e1)
        {
             System.out.println(e1.getMessage());
        }
		
	}

	@Override
	public void showAllEmployeeDetails() {
		// TODO Auto-generated method stub
		try {
            // load the driver
            Class.forName(driver);
            
            //create the connection
            Connection con= DriverManager.getConnection(dburl,user,password);
            
            //Write and Execute query
            Statement st=con.createStatement();
            String sql="select * from employee";
            ResultSet rs=st.executeQuery(sql);
            System.out.println("Employee details are : ");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getString(4));
                
            }
		}
            catch(ClassNotFoundException | SQLException e2)
            {
            	System.out.println(e2.getMessage());
            }		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
		try {
						
			//1.load the driver
			Class.forName(driver);
			
			//2.create the connection
			Connection con=DriverManager.getConnection(dburl,user,password);
			
			//3.write and execute query
			Statement st= con.createStatement();
			System.out.println("Enter employee Id whose salary needs to be changed: ");
			int id=sc.nextInt();
			System.out.println("Enter new salary: ");
			double salary=sc.nextDouble();

			String sql="update employee set esalary='"+salary+"' where eid = "+id+"";
			int n =st.executeUpdate(sql);
			if(n>=0) {
				System.out.println("salary updated");
			}

		}
		catch(ClassNotFoundException | SQLException e3)
        {
        	System.out.println(e3.getMessage());
        }
		
	}

	public void deleteEmployee() {



	   try {
	        Class.forName(driver);
	        Connection con=DriverManager.getConnection(dburl,user,password);
	        //write nd execute query
	        Statement st=con.createStatement();
	        int id;
	        System.out.println("Enter id of employee to be deleted");
	        Scanner scn=new Scanner(System.in);
	        id=scn.nextInt();
	        String sql="delete from employee where eid="+id+"";
	        int n=st.executeUpdate(sql);
	        if(n>=0)
	            System.out.println(n+" records affected");
	    
	    }
	        
	        catch (ClassNotFoundException |SQLException e) {
	        // TODO Auto-generated catch block
	        System.out.println(e.getMessage());
	    }
	}
	

}
