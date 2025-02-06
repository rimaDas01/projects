package oop;

public class Venue {
	
	private String address;
	private String city;
	private Long phnNo;
	
	public Venue() {}
	public Venue(String address, String city, Long phnNo) {
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
