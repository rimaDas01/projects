package oop;

abstract class Vehicle{
	abstract void drive();
}

class Cab extends Vehicle{
	@Override
	void drive() {
		System.out.println("Driving a cab");
	}
}
class Bike extends Vehicle{
	@Override
	void drive() {
		System.out.println("Driving a bike");
	}
}

public class AbstractClassEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v;
		v = new Cab();
		v.drive();
		v= new Bike();
		v.drive();
	}

}
