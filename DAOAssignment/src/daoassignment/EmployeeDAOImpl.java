package daoassignment;


public class EmployeeDAOImpl implements EmployeeDAO {
	
	Employee[]emps=new Employee[100];
	 int index;

	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		emps[index]=emp;
		index++;
		System.out.println("successfully added!");
	}

	@Override
	public void showAllEmployeeDetails() {
		// TODO Auto-generated method stub
		
		System.out.println("Employee details are: ");
		for(int i=0;i<index;i++)
			System.out.println(emps[i]);
		
	}

	

}
