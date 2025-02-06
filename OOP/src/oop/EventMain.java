package oop;

import java.time.LocalDate;

public class EventMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Venue ven = new Venue("ITC Royal", "Kolkata", 9088990887L);
		Event evt = new Event(1, "Birthday","5th Birthday celebration",LocalDate.of(2002, 10, 28), ven);
		System.out.println(evt);

	}

}
