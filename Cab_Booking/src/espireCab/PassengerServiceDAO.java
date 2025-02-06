package espireCab;
import java.sql.SQLException;

public interface PassengerServiceDAO {

	void showAllPassenger() throws SQLException;
	void bookCab() throws SQLException;
	void cancelCab() throws SQLException;
}
