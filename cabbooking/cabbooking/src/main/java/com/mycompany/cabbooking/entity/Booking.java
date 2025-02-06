package com.mycompany.cabbooking.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class Booking {
	
	@Id
	private Integer bookingId;
	private String customerName;
	private Long phoneNo;
	private String bookingType;		//You can get the value for this from enumerator
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "cab_no")
	private Cab cab;
	
	public Booking() {}
	public Booking(Integer bookingId, String customerName, Long phoneNo, String bookingType, Cab cab) {
		this.bookingId=bookingId;
		this.customerName=customerName;
		this.phoneNo=phoneNo;
		this.bookingType=bookingType;
		this.cab=cab;
	}
	
	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getBookingType() {
		return bookingType;
	}
	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}
	public Cab getCab() {
		return cab;
	}
	public void setCab(Cab cab) {
		this.cab = cab;
	}
	
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", customerName=" + customerName + ", phoneNo=" + phoneNo
				+ ", bookingType=" + bookingType + ", cab=" + cab + "]";
	}
	
}
