package com.mycompany.cabbooking.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mycompany.cabbooking.entity.Booking;
import com.mycompany.cabbooking.service.BookingService;
import com.mycompany.cabbooking.service.BookingServiceImpl;


@RestController
@RequestMapping("/api")
public class CabBookingAPI {

	@Autowired
	private BookingServiceImpl bookingService;

	@GetMapping("/cab/{ bookingType }")
	public ResponseEntity<List<Booking>> getDetailsByBookingType(String bookingType) {
		/*
		 * 	This method retrieves all the booking details with the given bookingType.​​​​​​
			Return an object of ResponseEntity with the List<BookingDTO> object obtained in the previous step as a response 
			and the HTTP response status as OK.
		 */
		return null;
	}
	
	@PostMapping("/cab")
	public ResponseEntity<String> bookCab(@RequestBody Booking booking){
		/*
		 * This method books a cab in CabBooking application​​​​​​​​​​​​​​​​​​​​​
		It receives booking details in the form of JSON. The JSON data should be populated in Booking parameter of this method.
		It should invoke the bookCab method of CabBookingServiceImpl class by passing the Booking  object which in turn will return the the bookingId.
		Create an object of ResponseEntity using string as message and HTTP status code as CREATED and return it. 
		 */
		Integer i=bookingService.bookCab(booking);
		return new ResponseEntity<String>(String.valueOf(i),HttpStatus.OK);
	}
}
