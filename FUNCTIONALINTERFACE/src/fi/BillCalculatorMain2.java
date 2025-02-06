package fi;

//By Using Lambda Expression 

@FunctionalInterface
interface IBillCalculator2{
	double calculate(int units,double chargePerUnit);
}

class BillCalculatorImpl2{
	void calc() {
		IBillCalculator c = (units,chargePerUnit)->{
			return units*chargePerUnit;
		};
		System.out.printf("Bill: $%.2f",c.calculate(100, 245.50));
	}
}

public class BillCalculatorMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new BillCalculatorImpl2().calc();
	}

}
