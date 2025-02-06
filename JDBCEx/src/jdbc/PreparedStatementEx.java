package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/espire";
		String user="root";
		String password ="root";
		try {
			//1.load the driver
			Class.forName(driver);
			
			//2.create the connection
			Connection con=DriverManager.getConnection(dbUrl,user,password);
			
			//write query
			//DML
			/*int id = 190;
			String name="Peter";
			double salary=10000;
			String designation = "Teacher";
//			String sql ="insert into employee_db values ("+id+",'"+name+"',"+salary+",'"+designation+"')";
			
			String sql ="insert into employee_db values(?,?,?,?)";*/
			
			
			
			
			//pass the values to the query for execution by set method
			/*st.setInt(1, id);
			st.setString(2, name);
			st.setDouble(3, salary);
			st.setString(4, designation);*/
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id: ");
			int id=sc.nextInt();
			
			String sql="select*from employee_db where eid=?";
			
			//create PreparedStatement reference
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, id);
			
			//result show 
			ResultSet rs = st.executeQuery();
			
			
				if(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" " +rs.getDouble(3));
				else
					System.out.println("Id doesnot exist");
			
			
			//execute the query
//			int n = st.executeUpdate();
//			if(n>=0)
//				System.out.println(n+" row affected");
		}
		catch(SQLException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
