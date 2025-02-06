package third;

public class Account {

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
		return "Acctno=" + acctno + ", balance=" + balance + "";
	}
}
