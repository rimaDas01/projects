package daoassignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class EmployeeUI {



   public static void main(String[] args) {
        // TODO Auto-generated method stub
        EmployeeDAOImpl impl=new EmployeeDAOImpl();
        
        Scanner sc=new Scanner(System.in);
        String driver="com.mysql.cj.jdbc.Driver";
        String dburl="jdbc:mysql://localhost:3306/espire";
        String user="root";
        String password="root";
        
        do {
            try {
                // load the driver
                Class.forName(driver);
                
                //create the connection
                Connection con=    DriverManager.getConnection(dburl,user,password);
                
                //Write and Execute query
                Statement st=con.createStatement();
                int id;
                String name;
                double salary;
                String designation;
                System.out.println("");
                System.out.println("\nAdd\nShow");
                System.out.println("enter your choice : ");
                int choice=sc.nextInt();
                switch(choice) {
                case 1:
                
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
                
                    String sql="insert into employee_db values("+id+",'"+name+"','"+designation+"',"+salary+")";
                    
                    Employee e1=new Employee(id,name,designation,salary);
                    impl.addEmployee(e1);
                    System.out.println("\n *__Add Succesfull__* \n");
                    choice=st.executeUpdate(sql);
                    break;
                case 2:
                    System.out.println("your all data is  : \n");
                    impl.showAllEmployeeDetails();
                    String sqlq="select * from employee";
                    ResultSet rs=st.executeQuery(sqlq);
                    while(rs.next())
                    {
                        System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getString(4));
                    }
                    break;
                }
            }
            catch(ClassNotFoundException |SQLException e1)
            {
                System.out.println(e1.getMessage());
            }
            }while(true);



   }



}