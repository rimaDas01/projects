//POJO class- PLain Old Java concept or Entity Or component Or Bean

package mvc;

public class Employee {
	
	private Integer id;
	private String name;
	Employee(){
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
	Employee(Integer id, String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + "]";
		return id+" "+name;
	}
}
