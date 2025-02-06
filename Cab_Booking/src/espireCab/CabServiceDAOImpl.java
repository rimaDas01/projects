package espireCab;
import java.sql.SQLException;

public class CabServiceDAOImpl implements CabServiceDAO{

	CabDAOImpl impl=new CabDAOImpl();

	@Override
	public void showAllCabs() throws SQLException {
		// TODO Auto-generated method stub
		impl.viewAllCabs();
	}


}
