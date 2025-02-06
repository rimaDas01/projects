package oop;

import java.time.LocalDate;

public class Event {
	private Integer eventId;
	private String eventTitle;
	private String eventDescription;
	private LocalDate eventDate;
	private Venue eventVenue;
	
	public Event() {}

	public Event(Integer eventId, String eventTitle, String eventDescription, LocalDate eventDate, Venue eventVenue) {
		super();
		this.eventId = eventId;
		this.eventTitle = eventTitle;
		this.eventDescription = eventDescription;
		this.eventDate = eventDate;
		this.eventVenue=eventVenue;
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

	public Venue getEventVenue() {
		return eventVenue;
	}
	public void setEventVenue() {
		this.eventVenue=eventVenue;
	}

	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", eventTitle=" + eventTitle + ", eventDescription=" + eventDescription
				+ ", eventDate=" + eventDate + ", eventVenue=" + eventVenue + "]";
	}
}
