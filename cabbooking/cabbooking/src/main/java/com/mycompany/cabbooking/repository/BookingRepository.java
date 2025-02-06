package com.mycompany.cabbooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mycompany.cabbooking.entity.Booking;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Integer> {
	
	List<Booking> getDetailsByBookingType(String bookingType);
	
	 @Query("select b from Booking b where b.bookingType=:bookingType")
	    Booking getDetailsByBookingType(@Param("bookingType")Integer bookingType);
}
