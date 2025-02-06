package com.mybank.bank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//Testing the BillCalculator class
class TestBillCalculator {
	//initialization by constructor
	BillCalculator bcal= new BillCalculator(100,0.18,10.0);

	//calculateBill() method is tested 
	@Test
	void testCalculateBill() {
		//1st param - expected value, 2nd param- actual value, 3rd param- difference btw actual and expected values
		assertEquals (1180.339,bcal.calculateBill(),0.4);
	}	
}