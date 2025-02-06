package espireCab;
import java.sql.Timestamp;

public class Booking  {

	private int bookingId;
	private Timestamp bookingDateTime;
	private String bookingStatus;
	
	Booking(){}

	public Booking(int bookingId, Timestamp bookingDateTime, String bookingStatus) {
		super();
		this.bookingId = bookingId;
		this.bookingDateTime = bookingDateTime;
		this.bookingStatus = bookingStatus;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Timestamp getBookingDateTime() {
		return bookingDateTime;
	}

	public void setBookingDateTime(Timestamp bookingDateTime) {
		this.bookingDateTime = bookingDateTime;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingDateTime=" + bookingDateTime + ", bookingStatus="
				+ bookingStatus + "]";
	};
	
	
	
}
