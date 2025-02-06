package third;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Transaction {
	List<Customer>custList;
	List<Bill>billList;
	Bill bill; 
	Customer customer;
	
	//constructors
	Transaction(){}
	public Transaction(List<Customer> custList, List<Bill> billList) {
		super();
		this.custList = custList;
		this.billList = billList;
	}
	
	//getCustomer method
	public Customer getCustomer(int id) {
		
	        for (Customer customer : custList) {
	            if(customer.getId() == id){
	                return customer;
	            }
	        }
	        return null;
	    }
		
	//payBill method
	public void payBill() {
		
		for (Bill bill : billList) {
            int custid = bill.getCustid();
            Customer customer = getCustomer(custid);
            if(customer == null){
                System.out.println(String.format("Customer with customer id %d does not exists",custid));
                continue;
            }
            double balance = customer.getAccount().getBalance();
            if(balance >= bill.getAmount()){
                bill.setPaid(true);
                bill.setBillPaymentDate(new Date());
                customer.getAccount().setBalance(balance-bill.getAmount());
                System.out.println(String.format("Bill paid for customer id %d",custid));
                break;
            }else{
                bill.setPaid(false);
//                System.out.println(String.format("Bill not paid for customer id %d",custid));
            }
            System.out.println(customer);
            System.out.println(bill);
        }
    }

}
