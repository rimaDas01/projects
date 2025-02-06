package com.mycompany.setter2;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private Project project;
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
	public String toString() {
	return String.format("ID: %-4s Name: %-10s Salary: $%-5s \nProject details:\n%s", id,name,salary,project);
	}

}
