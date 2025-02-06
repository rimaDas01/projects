package com.mycompany.cabbooking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.cabbooking.entity.Booking;
import com.mycompany.cabbooking.exception.CabBookingException;
import com.mycompany.cabbooking.repository.BookingRepository;
import com.mycompany.cabbooking.repository.CabRepository;

@Service
public class BookingServiceImpl implements BookingService{

	@Autowired
	private CabRepository cabRepository;
	
	@Autowired
	private BookingRepository bookingRepository;
	
	public List<Booking> getDetailsByBookingType(String bookingType) throws Exception{
		/*
		 * 	This method is used to get all the booking details with the given bookingType.
​​​​​​​​​​​​​​			Invoke the appropriate method of the BookingRepository interface which will return all the booking details with the given bookingType.
			If no booking details are available, throw an object of the CabBookingException with the message Service.NO_DETAILS_FOUND.
			​​​​​​​Else, populate a list, List<BookingDTO> with all the booking and respective cab details and return the list.​​​​​​​ 
​​​​​​​​
		 */
		Booking booking;
		
		List<Booking> list = bookingRepository.getDetailsByBookingType(bookingType);
      if(list.isEmpty())
          throw new CabBookingException("NO_DETAILS_FOUND");
      
      return list;
		
	}
	
	public Integer bookCab(Booking booking) {
		/*
		 * 	This method is used to book cab for the given customer to the existing cab
			Invoke the appropriate method of the CabRepository interface which will return details of the cab having the given cabNo (cabNo can be found in the Cab object of the Booking)
			If cab details are not found, throw an object of the CabBookingException with the message Service.CAB_NOT_FOUND
			If cab details are found and the availability of the retrieved cab is “No”, then throw an object of the CabBookingException with the message Service.CAB_NOT_AVAILABLE
			Else, create and populate a new object of Booking with the appropriate values from the Booking object
			Populate the cab details in this Booking object using Cab details retrieved earlier.​​​​​​​
			Set the availability of the above Cab object as "No"
			Then invoke the appropriate method of the BookingRepository to add the Booking object to the database which will return the same object with the auto-generated bookingId
			Return the above generated bookingId.
		 */
		
		bookingRepository.save(booking);
		return 1;
	}
}
