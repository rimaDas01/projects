package features;

public class SmallestGreatestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {20,200,2,2002,2000};
		int greatest = a[0];
		int smallest = a[0];
		for(int i=0;i<a.length;i++){
			if (a[i]>greatest)
				greatest = a[i];
		   else if(a[i]<smallest)
			smallest=a[i];
		}
		System.out.println("The greatest element is: "+greatest);
		System.out.println("The smallest element is: "+smallest);
	}
}

