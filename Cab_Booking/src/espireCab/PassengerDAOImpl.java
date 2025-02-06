package espireCab;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import database_cab.DBConnection;

public class PassengerDAOImpl implements PassengerDAO {

	DBConnection connection=new DBConnection();
	@Override
	public Passenger viewAllPassenger() throws SQLException {
		// TODO Auto-generated method stub
		Connection con=connection.getCon();
		Statement st=con.createStatement();
		String sql="select * from Passenger";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
		
		return null;
	}
	@Override
	public void bookTheRide() throws SQLException {
		// TODO Auto-generated method stub
		
		Timestamp ts=new Timestamp(System.currentTimeMillis());
		Date date=new Date(ts.getTime());
		
		Connection con=connection.getCon();
		Statement st=con.createStatement();
		String sql="insert into Booking values(102,'"+date+"',1433,2,'ONGOING')";
		if(st.executeUpdate(sql)!=0) {
			System.out.println("Booking done");
		}else{
			System.out.println("Booking failed");
		};
		
		
		
	}
	@Override
	public void cancelTheBooking() throws SQLException {
		// TODO Auto-generated method stub
		Connection con=connection.getCon();
		Statement st=con.createStatement();
		String sql="delete from Booking where bookingId=101";
		if(st.executeUpdate(sql)!=0) {
			System.out.println("Booking cancelled");
		}else {
			System.out.println("Booking with given Id does not exist");
		}
		
	}


}
