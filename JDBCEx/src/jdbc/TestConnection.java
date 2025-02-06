package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306";
		String user="root";
		String password ="root";
		try {
			//1.load the driver
			Class.forName(driver);
			
			//2.create the connection
			Connection con=DriverManager.getConnection(dbUrl,user,password);
			if(con!=null)
				System.out.println("Connection successful!");
			else
				System.out.println("Connection failed");
		}
		catch(ClassNotFoundException e1) {
			System.out.println(e1.getMessage());
		}
		catch(SQLException e2){
			System.out.println(e2.getMessage());
		}

	}

}
