package mvc;

public class EmployeeController {

	Employee employee;
	EmployeeView view;
	
	public EmployeeController(){
		employee = new Employee();
		view = new EmployeeView();

	}
	public void setModelData() {
		employee.setId(22);
		employee.setName("Alizeh");
	}
	public void updateView() {
		Integer id=employee.getId();
		String name = employee.getName();
		view.showEmployeeDetails(id, name);
	}

}
