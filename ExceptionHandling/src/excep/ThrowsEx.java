package excep;

public class ThrowsEx {
	
	static void m1()
	{
		try {
			m2();
		}catch(ArithmeticException e) {
			System.out.println("Exception thrown by m2 and handled by m1");
		}
	}
	static void m2() throws ArithmeticException{
		int a=2;
		int b=0;
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1();
	}

}
