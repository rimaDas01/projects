package com.mycompany.cabbooking.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cab")
public class Cab {

	@Id
	private Integer cabNo;
	private String modelName;
	private Long driverPhoneNo;
	private String availability;
	
	public Cab() {}
	public Cab(Integer cabNo, String modelName, Long driverPhoneno, String availability) {
		this.cabNo=cabNo;
		this.modelName=modelName;
		this.driverPhoneNo=driverPhoneno;
		this.availability=availability;
	}
	
	public Integer getCabNo() {
		return cabNo;
	}
	public void setCabNo(Integer cabNo) {
		this.cabNo = cabNo;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public Long getDriverPhoneNo() {
		return driverPhoneNo;
	}
	public void setDriverPhoneNo(Long driverPhoneNo) {
		this.driverPhoneNo = driverPhoneNo;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
	@Override
	public String toString() {
		return "Cab [cabNo=" + cabNo + ", modelName=" + modelName + ", driverPhoneNo=" + driverPhoneNo
				+ ", availability=" + availability + "]";
	}
	
}
