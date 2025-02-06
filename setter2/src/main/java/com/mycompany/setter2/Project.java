package com.mycompany.setter2;

public class Project {
	private String title;
	private String location;
	public String getTitle() {
	return title;
	}
	public void setTitle(String title) {
	this.title = title;
	}
	public String getLocation() {
	return location;
	}
	public void setLocation(String location) {
	this.location = location;
	}
	public String toString() {
	return String.format("Project name: %-10s Project location: %-10s",title,location);
	}


}
