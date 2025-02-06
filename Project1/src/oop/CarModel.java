package oop;
class Car{
	private String name;
	private double price;
	
	public void setName(String name) {
		this.name = name;
		}
	public void setPrice(double price) {
		this.price=price;
	}
	public String getName() {
		return name;
		}
	public double getPrice() {
		return price;
	}
	
}


public class CarModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.setName("Audi");
		c.setPrice(260000);
		System.out.println("Car Model: "+c.getName());
		System.out.println("Car Price: "+c.getPrice());

	}

}
