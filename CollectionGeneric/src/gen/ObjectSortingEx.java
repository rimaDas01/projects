package gen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {
	private Integer id;
	private String name;
	private Double salary;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	Employee(){}
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		
		if(this.getId()<emp.getId()) return -1;
		else if(this.getId()>emp.getId())return 1;
		else return 0;
	}
		
}
//class EmployeeComparator implements Comparator<Employee>{
//
//	@Override
//	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		/*if(emp1.getId()<emp2.getId())
			return-1;     //ascending order if -1 and 1 combo
		else if (emp1.getId()>emp2.getId()) 
			return 1;     //descending order if 1 and -1 combo
		else
			return 0;*/
		
		/*if(emp1.getSalary()<emp2.getSalary())
			return 1;     //ascending order if -1 and 1 combo
		else if (emp1.getSalary()>emp2.getSalary()) 
			return -1;     //descending order if 1 and -1 combo
		else
			return 0;*/
//		
//		if(emp1.getName().compareTo(emp2.getName())<1)return -1;
//		else if(emp1.getName().compareTo(emp2.getName())>1)return 1;
//		else return 0;
		
//	}
//	
//}

public class ObjectSortingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee[]emps=new Employee[3];
		emps[0]=new Employee(201,"Rima",20000.89);
		emps[1]=new Employee(102,"Lilo",90000.0);
		emps[2]=new Employee(103,"Oly",78900.90);
		
		//create collection
		List<Employee>empList =new ArrayList<>();
		
		//add objects to collection
		for(Employee e: emps)
			empList.add(e);
		
//		Collections.sort(empList, new EmployeeComparator());
		
		Collections.sort(empList);
		
		for(Employee e:empList)
			System.out.println(e);
		

	}

}
