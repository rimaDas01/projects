package four;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	public static java.sql.Connection getConnection() throws ClassNotFoundException, SQLException{
		
		String driver="com.mysql.cj.jdbc.Driver";
        String dburl="jdbc:mysql://localhost:3306/billpayment";
        String user="root";
        String password="root";
        Connection con=null;
    	Statement st= null;
        
       			
			//1.load the driver
			Class.forName(driver);
			
			//2.create the connection
			con=DriverManager.getConnection(dburl,user,password);
        
			if(con!=null)
				System.out.println("Connection successful");
			else
				System.out.println("Connection failed..");
			
			//3.write and execute query
			st= con.createStatement();
						
		return con;
		
	}

}
