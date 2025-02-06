package espireCab;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import database_cab.DBConnection;

public class BookingDAOImpl implements BookingDAO{

	DBConnection connection=new DBConnection();
	@Override
	public Booking viewAllBookings() throws SQLException {
		// TODO Auto-generated method stub
		Connection con=connection.getCon();
		Statement st=con.createStatement();
		String sql="select * from Booking";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getTimestamp(2)+" "+rs.getInt(3)+" "+rs.getString(4));
		}
		return null;
	}


	
}
