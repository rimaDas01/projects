package com.mycompany.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ){
    	
    	Scanner sc =new Scanner(System.in);
    	
    	String driver = "com.mysql.cj.jdbc.Driver";
    	String url="jdbc:mysql://localhost:3306/mycompany";
    	String user="root";
    	String password="root";
    	Connection con=null;
    	Statement st= null;
    	try {
    	Class.forName(driver);
    	}
    	catch(ClassNotFoundException e1) {
    		System.out.println(e1.getMessage());
    	}
    	/*try {
    	con = DriverManager.getConnection(url, user, password);
    	if(con!=null)
    		System.out.println("Connection Successful");
    	else 
			System.out.println("Connection failed");
    	}
    	catch(SQLException e2) {
    		System.out.println(e2.getMessage());
    	}*/
    	try {
//    		System.out.println("Enter id: ");
//    		
//    		int id=sc.nextInt();
//    		System.out.println("Enter emp name: ");
//    		String name=sc.next();
//    		System.out.println("Enter designation: ");
//    		String desig=sc.next();
    		
        	con = DriverManager.getConnection(url, user, password);
    		st=con.createStatement();
//        	String sql="insert into employee values(101,'Robert','Manager')";
//    		String sql="insert into employee values("+id+",'"+name+"','"+desig+"')";
//    		int n = st.executeUpdate(sql);
    		String sql="select * from employee";
    		ResultSet rs= st.executeQuery(sql);
    		
    		while(rs.next()) {
				System.out.println(rs.getInt("eid")+" "+rs.getString("ename")+" "+rs.getString(3));
			}
    		
//    		if(n>=0)
//    			System.out.println(n+" rows affected.");
			
		} catch (SQLException e3) {
			System.out.println(e3.getMessage());
			// TODO: handle exception
		}
   	}
}
