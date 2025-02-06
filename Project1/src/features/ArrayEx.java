package features;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int[]arr= {10,20,30,40,50};
		int n = arr.length;
		System.out.println("The length of the array is: "+n);
		System.out.println("The array elements are:");
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[n-1]);
		for (int i =0;i<n;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("The array elements in reverse order is: ");
		for (int i=n-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		
		//USING ADVANCED FOR LOOP
			System.out.println("Using advanced for loop: ");
			for(int element: arr)
				System.out.println(element);
			
		String[]names= {"Rima","Monica","Jelly","Tokyo"};
		for(String element:names)
			System.out.println("Hi "+element);
			
		*/
		
		int [][]a= {{10,20,30},{40,50,60},{70,80,90},{},{10,0,9}};
		//traverse through array
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
				}
			System.out.println();
			}
			
		}
}
