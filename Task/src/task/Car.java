package task;

public class Car {
	
	String model, vehicleNumber, fuelType;
	double price;
	boolean transmission;
	
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isTransmission() {
		return transmission;
	}

	public void setTransmission(boolean transmission) {
		this.transmission = transmission;
	}
	

	public void initCarDetails(String model,String vehicleNumber,String fuelType,double price,boolean transmission) {
		model = "Audi";
		vehicleNumber ="WB78907";
		fuelType="Diesel";
		price=8900.89;
		transmission=true;
		System.out.println("Car added");
		
	}
	public void displayCarDetails() {
		System.out.println("Details of cars are: ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Car c = new Car();
//		c.initCarDetails("Audi", "WB67806", "Diesel", 909999.780, true);
//		c.displayCarDetails();
		

	}

}
