package espireCab;
import java.sql.SQLException;

public class PassengerServiceDAOImpl implements PassengerServiceDAO {

	PassengerDAOImpl impl=new PassengerDAOImpl();
	@Override
	public void showAllPassenger() throws SQLException {
		// TODO Auto-generated method stub
		impl.viewAllPassenger();
	}
	@Override
	public void bookCab() throws SQLException {
		// TODO Auto-generated method stub
		impl.bookTheRide();
	}
	@Override
	public void cancelCab() throws SQLException {
		// TODO Auto-generated method stub
		impl.cancelTheBooking();
	}

}
