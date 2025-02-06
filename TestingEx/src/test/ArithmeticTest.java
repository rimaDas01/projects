package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArithmeticTest {

	Arithmetic obj = new Arithmetic();
	@Test
	void testAdd() {
//		fail("Not yet implemented");
		assertEquals(802.35, obj.add(123.45, 678.90));
	}

	@Test
	void testSubtract() {
//		fail("Not yet implemented");
		
//		assertEquals(0.0, obj.subtract(100.0, 100.0));
		assertEquals(-555.45, obj.subtract(123.45, 678.90),0.01);
	}
	
	@BeforeAll
	static void doThisBeforeAll() {
		System.out.println("Do this before all!");
	}
	
	@AfterAll
	static void doThisAfterAll() {
		System.out.println("Do this after all!");
	}
	
	@BeforeEach
	void doThisBforeEach() {
		System.out.println("Do this before each");
	}
	
	@AfterEach
	void doThisAfterEach() {
		System.out.println("Do this after each");
	}

}
