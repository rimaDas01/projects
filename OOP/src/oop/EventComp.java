package oop;

import java.time.LocalDate;

import oop.Event2.Venue2;

class Event2{
	
	private Integer eventId;
	private String eventTitle;
	private String eventDescription;
	private LocalDate eventDate;
	
	public Event2() {}

	public Event2(Integer eventId, String eventTitle, String eventDescription, LocalDate eventDate){
		super();
		this.eventId = eventId;
		this.eventTitle = eventTitle;
		this.eventDescription = eventDescription;
		this.eventDate = eventDate;
	}

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public String getEventTitle() {
		return eventTitle;
	}

	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}

	

	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", eventTitle=" + eventTitle + ", eventDescription=" + eventDescription
				+ ", eventDate=" + eventDate + "]";
	}
	
	//inner class
	class Venue2{
		private String address;
		private String city;
		private Long phnNo;
		
		public Venue2() {}
		public Venue2(String address, String city, Long phnNo) {
			super();
			this.address = address;
			this.city = city;
			this.phnNo = phnNo;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public Long getPhnNo() {
			return phnNo;
		}
		public void setPhnNo(Long phnNo) {
			this.phnNo = phnNo;
		}
		@Override
		public String toString() {
			return "Venue [address=" + address + ", city=" + city + ", phnNo=" + phnNo + "]";
		}
	}
}

public class EventComp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Event2 ev = new Event2(1, "Birthday","5th Birthday celebration",LocalDate.of(2002, 10, 28));

		Event2.Venue2 ven = ev.new Venue2("ITC Royal", "Kolkata", 9088990887L);
		System.out.println(ev);
		System.out.println(ven);
	}

}
