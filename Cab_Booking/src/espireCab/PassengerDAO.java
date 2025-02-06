package espireCab;
import java.sql.SQLException;

public interface PassengerDAO {

	public Passenger viewAllPassenger() throws SQLException;
	public void bookTheRide() throws SQLException;
	public void cancelTheBooking() throws SQLException;

}
