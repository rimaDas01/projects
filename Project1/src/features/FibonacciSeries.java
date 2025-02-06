package features;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b =1;
		int c=0;
//		System.out.println(c);
		System.out.println("Fibonacci series is: ");
		System.out.println(a);
		for(int i=1;i<=5;i++){
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
