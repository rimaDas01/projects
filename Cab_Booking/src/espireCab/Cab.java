package espireCab;

public class Cab {

	private int cabNo;
	private int driverId;
	private String cabModel;
	private String cabColour;
	private boolean availability;
	
	Cab(){}

	public Cab(int cabNo, int driverId, String cabModel, String cabColour, boolean availability) {
		super();
		this.cabNo = cabNo;
		this.driverId = driverId;
		this.cabModel = cabModel;
		this.cabColour = cabColour;
		this.availability = availability;
	}

	public int getCabNo() {
		return cabNo;
	}

	public void setCabNo(int cabNo) {
		this.cabNo = cabNo;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getCabModel() {
		return cabModel;
	}

	public void setCabModel(String cabModel) {
		this.cabModel = cabModel;
	}

	public String getCabColour() {
		return cabColour;
	}

	public void setCabColour(String cabColour) {
		this.cabColour = cabColour;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "Cab [cabNo=" + cabNo + ", driverId=" + driverId + ", cabModel=" + cabModel + ", cabColour=" + cabColour
				+ ", availability=" + availability + "]";
	};
	
	
}
