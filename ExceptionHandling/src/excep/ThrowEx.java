package excep;

public class ThrowEx {

	static void foo() {
		String errorMessage="exception occurred!";
		int a=1;
		int b=0;
		if(b==0)
			throw new ArithmeticException(errorMessage);
		else
			System.out.println(a/b);			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			foo();
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
