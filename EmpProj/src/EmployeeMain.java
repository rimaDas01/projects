import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee{
	private Integer id;
	private String name;
	private String designation;
	
	public Employee() {
		
	}
	public Employee(Integer id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}	
}

class EmployeeDAO {
	
	
	private List<Employee>list = new ArrayList<>();
	
	public EmployeeDAO() {
		list.add(new Employee(101,"Robert","HR"));
		list.add(new Employee(102, "Divya", "Analyst"));
	}
	
	public Employee getEmployeeById(int id) {
		Employee emp = null;
		boolean found=false;
		Iterator<Employee> it=list.iterator();
		while(it.hasNext()) {
			emp=it.next();
			if(emp.getId()==id) {
				System.out.println("Employee found");
				found=true;
			break;
			}
		}
		if (found)
			return emp;
		else
			return null;
	}
	

}


public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		EmployeeDAO e = new EmployeeDAO().getEmployeeById(101);
//		e.getEmployee(101);
		
		
	}

}
