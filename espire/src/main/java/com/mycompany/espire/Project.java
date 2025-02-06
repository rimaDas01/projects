package com.mycompany.espire;

public class Project {
	private String title;
    private String location;
    
    public Project() {
        this(null,null);
        }
    
    public Project(String title, String location) {
        this.title=title;
        this.location=location;
        }



   @Override
    public String toString() {
//        return "Project [title=" + title + ", location=" + location + "]";
	  return String.format("Project:%-20s\nLocation:%-20s",title,location);
    }

}
