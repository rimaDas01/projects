package com.mycompany.espire2;

import java.util.Iterator;
import java.util.List;


public class Employee {
	private int id;
	private String name;
	private double salary;
	private List<String> project;
	public Employee() {
	this(0,null,0.0d,null);
	}
	public Employee(int id, String name, double salary, List<String>project) {
	this.id=id;
	this.name=name;
	this.salary=salary;
	this.project=project;
	}
	public void display() {
	System.out.format(id+" "+name+" "+salary+" "+project);
	Iterator<String>iterator=project.iterator();
	while(iterator.hasNext())
	System.out.println(iterator.next());
	}
}
