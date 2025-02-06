package four;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.text.ParseException;

import org.junit.jupiter.api.Test;

class BillOperationImplTest {
	
	BillOperationImpl bl=new BillOperationImpl();

	@Test
	void testSaveBillRecord() throws ClassNotFoundException, SQLException, ParseException {
//		fail("Not yet implemented");
		assertEquals(0, bl.saveBillRecord(0, null, null, 0));
	}
	void testEditBillRecord() throws ClassNotFoundException, SQLException {
		assertEquals(0, bl.editBillRecord(0, 0, null, 0));
	}
	void testGetRemoveBillRecord() throws ClassNotFoundException, SQLException {
		assertEquals(0, bl.removeBillRecord(0));
	}
	void testGetAllBillRecord() throws ClassNotFoundException, SQLException {
		assertEquals(null, bl.getAllBillRecord());
	}
	
	void testGetBillRecordById() throws ClassNotFoundException, SQLException {
		assertEquals(null, bl.getBillRecordById(0));
	}
}
