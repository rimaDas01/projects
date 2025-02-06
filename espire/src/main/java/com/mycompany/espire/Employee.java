package com.mycompany.espire;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private Project project;
	
	public Employee() {
		this(0,null,0.0d,null);
	}

	public Employee(int id, String name, double salary, Project project)
	{
	    this.id=id;
	    this.name=name;
	    this.salary=salary;
	    this.project=project;
	}
	@Override
	public String toString() {
	    return "id=" + id + ", name=" + name + ", salary=" + salary + ", project=" + project + " ";
	}
}
