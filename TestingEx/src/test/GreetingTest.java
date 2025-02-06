package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreetingTest {
	
	Greeting g = new Greeting();

	
	@Test
	void testSayHello() {
//		fail("Not yet implemented");
		assertEquals("Hello", g.sayHello());
	}

	@Test
	void testGetDate() {
//		fail("Not yet implemented");
		assertEquals("20-09-2022", g.getDate());

	}
}
