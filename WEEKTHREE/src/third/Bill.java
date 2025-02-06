package third;
import java.util.Date;

public class Bill {
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
