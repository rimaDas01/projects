package espireCab;
import java.sql.SQLException;

public class UserDAOServiceImpl implements UserDAOService{

	UserDAOImpl impl=new UserDAOImpl();
	@Override
	public void addnewUser() throws SQLException {
		// TODO Auto-generated method stub
		impl.addUser();
	}

}
