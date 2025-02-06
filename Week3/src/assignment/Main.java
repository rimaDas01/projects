package assignment;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import gen.Book;

//Account class
class Account{
	//fields
	 private int acctno;
	 private double balance;
	 
	 //Constructors
	 Account(){
		 
	 }
	public Account(int acctno, double balance) {
		super();
		this.acctno = acctno;
		this.balance = balance;
	}
	
	//getters-setters
	public int getAcctno() {
		return acctno;
	}
	public void setAcctno(int acctno) {
		this.acctno = acctno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Account [acctno=" + acctno + ", balance=" + balance + "]";
	}		
}

//Customer class
class Customer{
	
	//fields
	private int id;
	private String name;
	private String phone;
	private Account account;
	
	//constructors
	Customer(){}
	public Customer(int id, String name, String phone, Account account) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.account = account;
	}
	//setter-getter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	//toString()
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", account=" + account + "]";
	}		
}

//Bill class
class Bill{
	private int id;
	private int custid;
	private Date billGenerationDate;
	private Date billPaymentDate;
	private double amount;
	private boolean paid;
	
	//Constructors
	Bill(){}
	public Bill(int id, int custid, Date billGenerationDate, Date billPaymentDate, double amount, boolean paid) {
		super();
		this.id = id;
		this.custid = custid;
		this.billGenerationDate = billGenerationDate;
		this.billPaymentDate = billPaymentDate;
		this.amount = amount;
		this.paid = paid;
	}
	
	//getters-setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public Date getBillGenerationDate() {
		return billGenerationDate;
	}
	public void setBillGenerationDate(Date billGenerationDate) {
		this.billGenerationDate = billGenerationDate;
	}
	public Date getBillPaymentDate() {
		return billPaymentDate;
	}
	public void setBillPaymentDate(Date billPaymentDate) {
		this.billPaymentDate = billPaymentDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public boolean isPaid() {
		return paid;
	}
	public void setPaid(boolean paid) {
		this.paid = paid;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Bill [id=" + id + ", custid=" + custid + ", billGenerationDate=" + billGenerationDate
				+ ", billPaymentDate=" + billPaymentDate + ", amount=" + amount + ", paid=" + paid + "]";
	}		
}

//Transaction class
class Transaction{
	//members
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
		
		/*Customer c = null;
		Iterator<Customer>it=custList.iterator();
		while(it.hasNext()) {
			Customer customer =it.next();
			if(customer.getId()==(id)) {
				 c= customer;
				 //System.out.println("Customer found");
				 }}
//		}
//		else
//			return null;
//		
//		}
	//	return c;	*/
		
		if (customer.getId()==id)
			return customer;
		else 
			return null;
		
	}
	
	public void payBill() {
		//call getCustomer() method
		
		 /*Date date=new Date(2022,01,01);
         Date date1=new Date(2022,01,01);

         Bill[]bill=new Bill[2];
      bill[0]= new Bill(1,1,date,date1,1000,false);
      Date date2=new Date(2022,01,01);
      Date date3=new Date(2022,01,01);
     bill[0]= new Bill(2,2,date2,date3,1500,true);
//      bill[1]= new Bill(2,1500.0);
      List<Bill>BillList=new ArrayList<>();
      for(Bill ob1:bill)
          {
              BillList.add(ob1);
          }
      System.out.println(bill[0]);        
  }*/
		
		
		
}

public class Main {
	
	

	public void main(String[] args) {
		// TODO Auto-generated method stub
		

		Account acc1,acc2;
		acc1= new Account(1,1000.0);
		acc2= new Account(2,1500.50);
		
		Customer c1,c2;
		c1= new Customer(1, "Tom", "9090901010",acc1 );
		c2= new Customer(2, "Jerry","9090902020",acc2 );

		
		List<Customer> custList = new ArrayList<>();
		custList.add(c1);
		custList.add(c2);
		
		Transaction t=new Transaction();
		System.out.println(t.getCustomer(1));
		
		
//		Bill b1,b2;
//		
//		b1= new Bill(1, 1,new Date(12-9-202) ,new Date(18-9-2022),2000.0, false);
//		b2= new Bill(2, 2, null, null, 3500, true);
//		
//		List<Bill> billList = new ArrayList<>();
		
		
		
		

		
				
		
		//transcation class object
		

	}

}
}
