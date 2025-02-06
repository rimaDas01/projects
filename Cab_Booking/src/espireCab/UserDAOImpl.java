package espireCab;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import database_cab.DBConnection;

public class UserDAOImpl implements UserDAO {

	DBConnection connection=new DBConnection();
	@Override
	public void addUser() throws SQLException {
		// TODO Auto-generated method stub
		Connection con=connection.getCon();
		Statement st=con.createStatement();
		String sql="insert into User values('espireIND','123456789','ADMIN')";
		if(st.executeUpdate(sql)!=0) {
			System.out.println("NEW USER ADDED!");
		}else{
			System.out.println("User not added");
		};
	}

}
