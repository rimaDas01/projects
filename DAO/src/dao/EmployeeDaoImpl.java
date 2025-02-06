package dao;

public class EmployeeDaoImpl implements EmployeeDao {
	Employee[]emps=new Employee[100];
	 int index;

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		emps[index]=e;
		index++;
	}

	@Override
	public void showAllEmployees() {
		// TODO Auto-generated method stub
		for(int i=0;i<index;i++)
			System.out.println(emps[i]);
	}

	@Override
	public void showEmpDesignation(int empId,String empDesignation) {
		// TODO Auto-generated method stub
		
		boolean edited=false;
		for(int i=0;i<index;i++) {
			if(emps[i].getId()==empId) {
				emps[i].setDesignation(empDesignation);
				edited=true;
				break;
			}
				
		}
		if(edited) {
			System.out.println("Employee details edited");
		}
		else {
			System.out.println("Employee not found");
		}
	}

	@Override
	public void searchEmployee(int empId) {
		
		// TODO Auto-generated method stub
		Employee emp;
		boolean found=false;
		for(int i=0;i<index;i++) {
			if(emps[i].getId()==empId) {
				found=true;
				emp=emps[i];
				break;
			}
	}	
		if(found) {
			System.out.println("Employee found");
			System.out.println("Emp ID is: "+empId);
		}
		else
			System.out.println("employee not found");
	}

	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		boolean deleted=false;
		for(int i=0;i<index;i++) {
			if(emps[i].getId()==empId) {
				emps[i].setId(0);
				emps[i].setName(null);
				emps[i].setDesignation(null);
				deleted=true;
				break;
			}
				
		}
		if(deleted) {
			System.out.println("Employee details deleted");
		}
		else {
			System.out.println("Employee not found");
		}
	}
}
