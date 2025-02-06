package dao;

public interface EmployeeDao {
	
	void addEmployee(Employee e);
	void showAllEmployees();
	void showEmpDesignation(int empId,String empDesignation); //editEmp()
	void searchEmployee(int empId);
	void deleteEmployee(int empId);
}

