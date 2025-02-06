package four;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BillTest {

	Bill b= new Bill();
	
	@Test
	void testGetBillId() {
	assertEquals(0,b.getBillId());
	}
	@Test
	void testGetCustomerId() {
	assertEquals(0,b.getCustomerId());
	}
	@Test
	void testGetBillDate() {
		assertEquals(null,b.getBillDate());

	}
	void testGetBillDescription() {
		assertEquals(null,b.getBillDescription());
	}
	void testGetBillAmount() {
		assertEquals(0, b.getBillAmount());
	}
}
