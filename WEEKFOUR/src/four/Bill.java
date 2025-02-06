package four;

import java.util.Date;

public class Bill {
	//fields 
	 	private int billId;
	    private int customerId;
	    private Date billDate;
	    private String billDescription;
	    private double billAmount;
	    
	    //constructors
	    public Bill(){}
   	   public Bill(int billId, int customerId, Date billDate, String billDescription, double billAmount) {
	        super();
	        this.billId = billId;
	        this.customerId = customerId;
	        this.billDate = billDate;
	        this.billDescription = billDescription;
	        this.billAmount = billAmount;
	    }


   	   //getters-setters
	   public int getBillId() {
	        return billId;
	    }



	   public void setBillId(int billId) {
	        this.billId = billId;
	    }



	   public int getCustomerId() {
	        return customerId;
	    }



	   public void setCustomerId(int customerId) {
	        this.customerId = customerId;
	    }



	   public Date getBillDate() {
	        return billDate;
	    }



	   public void setBillDate(Date billDate) {
	        this.billDate = billDate;
	    }



	   public String getBillDescription() {
	        return billDescription;
	    }



	   public void setBillDescription(String billDescription) {
	        this.billDescription = billDescription;
	    }



	   public double getBillAmount() {
	        return billAmount;
	    }



	   public void setBillAmount(double billAmount) {
	        this.billAmount = billAmount;
	    }


	   //toString method
	   @Override
	    public String toString() {
	        return "Bill [billId=" + billId + ", customerId=" + customerId + ", billDate=" + billDate + ", billDescription="
	                + billDescription + ", billAmount=" + billAmount + "]";
	    }
}
