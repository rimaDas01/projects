package espireCab;
import java.sql.SQLException;

public class BookingServiceDAOImpl implements BookingServiceDAO {

	BookingDAOImpl impl=new BookingDAOImpl();
	@Override
	public void showAllBooking() throws SQLException {
		// TODO Auto-generated method stub
		
		impl.viewAllBookings();
	}

	
}
