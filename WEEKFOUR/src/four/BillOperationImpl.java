package four;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BillOperationImpl implements IBillOperation{

	
	DBConnection dbc =new DBConnection();
	
	//implementation of method 1
	@Override
	public int saveBillRecord(int customer_id, Date bill_date, String bill_description, double bill_amount)throws SQLException,ParseException, ClassNotFoundException{	
		
        Connection con=dbc.getConnection();
        Statement st=con.createStatement();
		String sql="insert into bill(customerid,billdate,billdescription,billamount) values("+customer_id+",'"+bill_date+"','"+bill_description+"',"+bill_amount+")";

		//DML
        int n=st.executeUpdate(sql);
        if(n>=0)
            System.out.println(n+" record(s) affected");
        
	return n;	
	}
	//implementation of method 2
	@Override
	public int editBillRecord(int billid, int customer_id, String bill_description,
			double bill_amount) throws ClassNotFoundException, SQLException {
		Connection con=dbc.getConnection();
        Statement st=con.createStatement();       

		String sql = "update bill set customerId=" + customer_id + ",billDescription ='" + bill_description + "',billAmount = " + bill_amount
                + " where billId=" + billid + "";
        
        //DML
        int n=st.executeUpdate(sql);
        if(n>=0)
            System.out.println(n+" record(s) edited");
        
        return n;
       
	}
	
	//implementation of method 3
	@Override
	public int removeBillRecord(int billid) throws ClassNotFoundException, SQLException {
		

		Connection con=dbc.getConnection();
        Statement st=con.createStatement();
		
        String sql = "delete from bill where billId="+billid+"";
        
        //DML
        int n=st.executeUpdate(sql);
        if(n>=0)
            System.out.println(n+" record(s) deleted");
        
        return n;
	
   	}
	
	//implementation of method 4
	@Override
	public List<Bill> getAllBillRecord() throws ClassNotFoundException, SQLException {
		

		Connection con=dbc.getConnection();
        Statement st=con.createStatement();
		
		String sql="select * from bill";
		ResultSet billSet=st.executeQuery(sql);
		while(billSet.next()) {
			System.out.println(billSet.getString(1)+" "+billSet.getString(2)+" "+billSet.getString(3)+" "+billSet.getString(4)+" "+billSet.getString(5));
		}
		
		return (List<Bill>) billSet;
		
	}
	
	//implementation of method 5
	@Override
	public Bill getBillRecordById(int bill_id) throws SQLException, ClassNotFoundException {
			
		Bill bill=new Bill();

		List<Bill>billList=new ArrayList<>();
		
		String sql="select * from bill where  billId="+bill_id+"";

		Connection con=dbc.getConnection();
        Statement st=con.createStatement();
			for (Bill i: billList) {
			if(i.getBillId()== bill_id)
				return i;
			
			}		
		
		
		return null;
	}
	

}
