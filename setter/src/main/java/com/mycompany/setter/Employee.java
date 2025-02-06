package com.mycompany.setter;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private Map<String,String>project;
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public double getSalary() {
	return salary;
	}
	public void setSalary(double salary) {
	this.salary = salary;
	}
	public Map<String, String> getProject() {
	return project;
	}
	public void setProject(Map<String, String> project) {
	this.project = project;
	}
	public void display() {
	System.out.println("Employee details:\n");
	System.out.format("ID:%-10s\nName:%-10s\nSalary:$%-10s\nProjects:\n", id,name,salary);
	Set<Entry<String, String>> set=project.entrySet();
	Iterator<Entry<String, String>> iterator=set.iterator(); 
	 while(iterator.hasNext()){ 
	 Entry<String, String> entry=iterator.next(); 
	 String prjTitle=entry.getKey(); 
	 String prjLocation=entry.getValue(); 
	 System.out.println("Project title: "+prjTitle); 
	 System.out.println("Project location: "+prjLocation); 
	 } 
	}


}
