package third;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object of Account class
	   	Account acc1,acc2;
		acc1= new Account(1,1000.0);
		acc2= new Account(2,1500.50);
		
		//Objects of Customer class
		Customer c1,c2;
		c1= new Customer(1, "Tom", "9090901010",acc1 );
		c2= new Customer(2, "Jerry","9090902020",acc2 );
		
		List<Customer> custList = new ArrayList<>();
        
		//adding customers to customer list
		custList.add(c1);
		custList.add(c2);
		

//		Date billGenerationDate= new Date();System.out.println(billGenerationDate);
		
		//creating bill list through ArrayList
        List<Bill> billList = new ArrayList<>();
        billList.add(new Bill(1,1,new Date(1662976221000L),new Date(1962976921000L),1001,false));
        billList.add(new Bill(2,2,new Date(1663062621000L),new Date(1967976921000L),500,false));
        billList.add(new Bill(3,3,new Date(1663062621000L),null,1000,false));


        Transaction tran = new Transaction(custList,billList);
        tran.payBill();

	}

}
