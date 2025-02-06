package composite;

public class CompNum {

	public static void main(String[] args) {
		int n = 30 , count = 0;
		for (int i=1; i<=n; i++) {
			if (n%i == 0)
				count++;
		}
		System.out.print("Count = ");
		System.out.print(count);
		System.out.println();
		if (count > 2) 
			System.out.println("It is composite number");
		else 
			System.out.println("It is a prime number");
	}

}
