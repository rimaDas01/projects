package four;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BillOperationMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		java.sql.Date sqlDate;
		java.util.Date utilDate=null;
		
		
		BillOperationImpl impl = new BillOperationImpl();
		
		DBConnection dbc= new DBConnection();
		
		dbc.getConnection();
		                
		                /*Menu Based application*/
		
		int choice=0;
		System.out.println("Enter you choice:\n1-Add\n2-Edit\n3-Delete\n4-Show\n5-Fetch");
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			
			System.out.println("Enter customer id: ");
			int customer_id= sc.nextInt();
			
			System.out.println("Enter date: ");
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			String bill_date=sc.next();
			utilDate =sdf.parse(bill_date);
			sqlDate= new java.sql.Date(utilDate.getTime());
			
			System.out.println("Enter bill description: ");
			String bill_description= sc.next();
			
			System.out.println("Enter bill amount: ");
			Double bill_amount= sc.nextDouble();
			
			impl.saveBillRecord(customer_id, sqlDate, bill_description, bill_amount);
			break;
			
		case 2: 
			System.out.println("Enter bill id: ");
			int billid= sc.nextInt();
			
			System.out.println("Enter customer id: ");
			int customerid= sc.nextInt();
			
			System.out.println("Enter bill description: ");
			String billdescription= sc.next();
			
			System.out.println("Enter bill amount: ");
			Double billamount= sc.nextDouble();
			
			
			impl.editBillRecord(billid, customerid, billdescription,billamount);
			break;
		case 3:
			System.out.println("Enter bill_id: ");
			int b_id= sc.nextInt();
			impl.removeBillRecord(b_id);
			break;
		case 4:
			
			impl.getAllBillRecord();
			break;
		case 5:
			
			System.out.println("Enter Bill Id: ");
			int billId=sc.nextInt();
			impl.getBillRecordById(billId);
			break;
			
		default:
				System.out.println("Invalid choice!");
		}

	}

}
