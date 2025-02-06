package sme;

import java.util.HashMap;
import java.util.Map;

class Employee1{
	private int age;
	private String name;
	private String dept;

	public Employee1(){}
	public Employee1(int age,String name,String dept){
		this.age=age;
		this.name=name;
		this.dept=dept;
	}
	public int getAge(){
		return age;
	}
	public void setAge(){
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee1 [age=" + age + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
}

//interface EmployeeClass{
//	public void work();
//}


public class EmployeeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer>employee = new HashMap<>();
		employee.put("Rima",33);
		employee.put("Roger",77);
		employee.put("Richa",50);

		Integer emp1= employee.get("Rima");
		System.out.println(emp1);
//		employee.get(emp2);
//		employee.get(emp3);
		
		
	}

}
