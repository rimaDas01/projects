package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBConnections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/espire2";
		String user="root";
		String password ="root";
		try {
			
//			
			//1.load the driver
			Class.forName(driver);
			
			//2.create the connection
			Connection con=DriverManager.getConnection(dbUrl,user,password);
			
			//3.write and execute query
			Statement st= con.createStatement();
			
			
			//INSERT VALUES
			
//			
			/*System.out.println("Enter Employee Id: ");
			int id=sc.nextInt();
			System.out.println("Enter Employee Name: ");
			String name=sc.next();
			sc.nextLine();
			System.out.println("Enter Employee salary: ");
			double salary=sc.nextDouble();
			System.out.println("Enter Employee Designation: ");
			String designation =sc.next();
			sc.nextLine();
			String sql="insert into employee_db values("+id+",'"+name+"',"+salary+",'"+designation+"')";
//			}
			*/
			
			
			//UPDATE
			
			/*System.out.println("Enter employee Id whose salary needs to be changed: ");
			int eid=sc.nextInt();

			String sql = "update employee_db set esalary =esalary-900 where eid = "+eid;*/
			
			
			
			//DELETE
			/*System.out.println("Enter Employee id you want to delete: ");
			int eid=sc.nextInt();
			String sql = "delete from employee_db where eid="+eid;
			
			int n =st.executeUpdate(sql);
			if(n>=0)
				System.out.println(n+" records affected!");*/
			
			
			
			//VIEW WHOLE TABLE
			
			/*String sql="select * from employee_db";
			
			ResultSet rs = st.executeQuery(sql);
			
			
			while(rs.next()) {
				System.out.println(rs.getInt("eid")+" "+rs.getString("ename")+" "+rs.getDouble(3)+" "+rs.getString(4));
			}*/
			
			
			/*String sql="select ename,edesignation,esalary from employee_db";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString("ename")+" "+rs.getString(2)+" " +rs.getDouble(3));
			}*/
			
		
			
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
