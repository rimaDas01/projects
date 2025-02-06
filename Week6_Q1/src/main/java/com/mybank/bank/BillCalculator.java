package com.mybank.bank;

//POJO Class
public class BillCalculator {
	//fields
	private int  units;
	private double tax;
	private double unitPrice;
	
	//default constructor
	public BillCalculator() {
		this(0,0.0d,0.0d);
	}
	
	//parameterized constructor
	public BillCalculator(int units,double tax,double unitPrice) {
		this.units=units;
		this.tax=tax;
		this.unitPrice=unitPrice;
		}

	//method
	public double calculateBill() {
		return (unitPrice+(unitPrice*tax))*units;	
	}
}
