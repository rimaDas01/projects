package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {
	
	Book b = new Book();
	

	@Test
	void testGetTitle() {
		b.setTitle("Java");
		assertEquals("Java",b.getTitle());
	}
	
	@Test
	void testGetPrice() {
		b.setPrice(900.00);
		assertEquals(900.50, b.getPrice(),0.50);
	}

}
