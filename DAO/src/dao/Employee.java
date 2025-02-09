package dao;


public class Employee {

		private int id;
		private String name,designation;
		
		public Employee() {	
		}
		public Employee(int id,String name) {
			this.id = id;
			this.name=name;
		}
		public Employee(int id,String name, String designation) {
			this.id = id;
			this.name=name;
			this.designation=designation;
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
