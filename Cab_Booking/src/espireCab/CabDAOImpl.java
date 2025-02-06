package espireCab;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database_cab.DBConnection;

public class CabDAOImpl implements CabDAO {

	
	DBConnection connection=new DBConnection();
	
	@Override
	public Cab viewAllCabs() throws SQLException {
		
		Connection con=connection.getCon();
		Statement st=con.createStatement();
		String sql="select * from Cab";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getBoolean(5));
		}
		
		return null;
	}

}
