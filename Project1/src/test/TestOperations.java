package test;
import arithmetic.Arithmetic;
import logical.Logical;
import relational.Relational;

public class TestOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic A = new Arithmetic();
		Logical L = new Logical();
		double x=A.add(10.9,13.90);
		double y=A.subtract(33.9,12);
		int p=L.and(10,20);
		int q= L.or(10,20);
		int r= L.xor(10,20);
		System.out.println(x);
		System.out.println(y);
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);	
		
		Relational R = new Relational();
		 	
		System.out.println(R.lessThan(12, 2));
		System.out.println(R.greaterThan(20,10));
	}

}
