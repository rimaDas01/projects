package com.mycompany.ci;

public class Project {
	private String title;
	private String location;
	
	public Project () {
		this(null,null);
	}
	public Project(String title, String location) {
		this.title = title;
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "\nProject title:" + title + "\nLocation:" + location+"";
	}
}
