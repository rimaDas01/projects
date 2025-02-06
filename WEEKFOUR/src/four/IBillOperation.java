package four;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

public interface IBillOperation {
	//method 1
	public int saveBillRecord(int customer_id,
            Date bill_date,
            String
            bill_description,
            double bill_amount) throws SQLException, ParseException, ClassNotFoundException;
    //method 2
   public int editBillRecord(int billid, int customer_id,String bill_description,
            double bill_amount) throws ClassNotFoundException, SQLException;
    //method 3
   public int removeBillRecord(int bill_id) throws ClassNotFoundException, SQLException;
    //method 4
    public List<Bill> getAllBillRecord() throws ClassNotFoundException, SQLException;
    //method 5
   public Bill getBillRecordById(int bill_id) throws SQLException, ClassNotFoundException;

}
