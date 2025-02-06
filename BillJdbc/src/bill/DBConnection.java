package bill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/javaproject1";
		String user="root";
		String password ="root";
		try {
			//1.load the driver
			Class.forName(driver);
			
			//2.create the connection
			Connection con=DriverManager.getConnection(dbUrl,user,password);
			
			//3.write and execute query
			Statement st= con.createStatement();
			
			if(con!=null)
                System.out.println("Connection successful");
              else
                System.out.println("Connection failed");
			
//			String sql="select * from product";
			
		}
		catch(ClassNotFoundException | SQLException  e) {
			System.out.println(e.getMessage());
		}
	}
}
