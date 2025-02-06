package trynow;

public class Try {
	private int id;
	private double ecn;
		 
	public Try(int id, double ecn) {
		super();
		this.id = id;
		this.ecn = ecn;
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getEcn() {
		return ecn;
	}



	public void setEcn(double ecn) {
		this.ecn = ecn;
	}



	public double calc() {
		return id*ecn;
	}
}
