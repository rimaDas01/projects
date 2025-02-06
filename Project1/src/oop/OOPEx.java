package oop;

class Employee{
	private String name;
	private int id;
	private String designation;
	private double salary;
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDesignation() {
		return designation;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}
}

public class OOPEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setId(202);
		e.setName("Rima");
		e.setDesignation("Java Developer");
		e.setSalary(23000);
		System.out.println("Employee ID is: "+e.getId());
		System.out.println("Employee name is: "+e.getName());
		System.out.println("Employee designation is: "+e.getDesignation());
		System.out.println("Employee salary is: "+e.getSalary());
	}

}
