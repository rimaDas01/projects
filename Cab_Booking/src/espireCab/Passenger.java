package espireCab;

public class Passenger {

	private int passengerId;
	private String passengerName;
	private String passengerPhone;
	private String passengerEmail;
	
	Passenger(){}

	
	
	public Passenger(int passengerId, String passengerName, String passengerPhone, String passengerEmail) {
		super();
		this.passengerId = passengerId;
		this.passengerName = passengerName;
		this.passengerPhone = passengerPhone;
		this.passengerEmail = passengerEmail;
	}



	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getPassengerPhone() {
		return passengerPhone;
	}

	public void setPassengerPhone(String passengerPhone) {
		this.passengerPhone = passengerPhone;
	}

	public String getPassengerEmail() {
		return passengerEmail;
	}

	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}



	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", passengerName=" + passengerName + ", passengerPhone="
				+ passengerPhone + ", passengerEmail=" + passengerEmail + "]";
	};
	
	
}
