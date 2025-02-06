package oop;

abstract class Bank{
	double getROI(){
		return 6.5;
	}
	abstract double getSI(double principle, int period);
}


class MyBank extends Bank{

	@Override
	double getSI(double principle, int period) {
	double si;
	si=principle*period*getROI()/100;
	return si+0.02;
	}
}

class NationalBank extends Bank{

	@Override
	double getSI(double principle, int period) {
	double si;
	si=principle*period*getROI()/100;
	return si;
	}
}

public class AbstractClassEx2 {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.out.println(new MyBank().getSI(100000,12));
		System.out.println(new NationalBank().getSI(100000,12));
	}
}
