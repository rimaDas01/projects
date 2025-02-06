package fi;

@FunctionalInterface
interface IBillCalculator{
	double calculate(int units,double chargePerUnit);
}
class BillCalculatorImpl{
	void calc() {
		IBillCalculator c = new IBillCalculator() {
			
			@Override
			public double calculate(int units, double chargePerUnit) {
				// TODO Auto-generated method stub
				return units*chargePerUnit;
			}
		};
		System.out.printf("Bill: $%.2f",c.calculate(100, 45.50));
	}
}


public class BillCalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BillCalculatorImpl().calc();

	}

}
