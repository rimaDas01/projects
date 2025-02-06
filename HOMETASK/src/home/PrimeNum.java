package home;

public class PrimeNum {
	public static void main(String[]args){
		int n=15;
		boolean numIsPrime=true;
		/*if(n<2)
		{
			numIsPrime=false;
		}*/
		if(n>2)
		{
			for(int i=2; i<n; i++)
			{	
				if(n%i==0)
				{
					numIsPrime=false;
					break;
				}
			}
		}
		if(numIsPrime)
			System.out.print(n+" is prime");
		else
			System.out.print(n+" is not prime");
	}
}
