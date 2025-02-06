package com.mycompany.ci;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private Project project;
	
	public Employee() {
		this(0,null,0.0,null);
	}
	public Employee(int id, String name, double salary, Project project) {
		this.id = id;
		this.name = name;
		this.salary= salary;
		this.project = project;
	}
	
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
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	@Override
	public String toString() {
		return "id=" + id + ",\nname=" + name + ",\nsalary=" + salary + ",\nproject=" + project +"";
	}
}
