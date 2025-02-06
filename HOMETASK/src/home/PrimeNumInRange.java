package home;

public class PrimeNumInRange {
	//isPrime method
		static boolean isPrime(int n){
	
			boolean numIsPrime=true;
			if(n>2)
			{
				for(int i=2; i<n; i++)
				{	
					if(n%i==0)
					{
						numIsPrime=false;
					}
				}
			}
			return numIsPrime;
		}



		//main method
		public static void main(String[]args){
			int lower=10;
			System.out.println("All prime numbers are: ");
			for(int i=lower;i<=30;i++)
				if(isPrime(i))
			System.out.println(i);	
		}

}
