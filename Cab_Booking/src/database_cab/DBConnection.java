package database_cab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBConnection {
	String driver="com.mysql.cj.jdbc.Driver";
	String dburl="jdbc:mysql://localhost:3306/miniproject";
	String user="root";
	String password="root";
	Connection con;
	
	public void createConnection() {
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(dburl,user,password);
			//Statement st=con.createStatement();
			if(con!=null) {
				System.out.println("Connection successful");
				//Statement st=con.createStatement();
			//	return con;
				}
				else {
					System.out.println("Connection failed");
		}}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	public Connection getCon() {
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(dburl,user,password);
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		return con;
	}
}
