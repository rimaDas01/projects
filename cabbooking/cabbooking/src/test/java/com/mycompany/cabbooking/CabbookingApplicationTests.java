package com.mycompany.cabbooking;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mycompany.cabbooking.repository.BookingRepository;
import com.mycompany.cabbooking.repository.CabRepository;
import com.mycompany.cabbooking.service.BookingService;

@SpringBootTest
class CabbookingApplicationTests {

	@Autowired
	private CabRepository cabRepository;
	
	@Autowired
	private BookingRepository bookingRepository;
	
	@Autowired
	private BookingService bookingService;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void bookCabInvalidCabNoTest(){
		//This test case is to test for the exception if cabNo is invalid
		//Take any appropriate value for the cabNo to result in this exception being thrown and valid values for rest of the fields
	}

	@Test
	void getDetailsByBookingTypeNoDetailsFound() {
		//This test case is to test for the exception if bookingType is invalid
		//Take any appropriate value for the bookingType to result in this exception being thrown and valid values for rest of the fields
	}
}
