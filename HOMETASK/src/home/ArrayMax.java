package home;

import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
       int n=sc.nextInt();
       int arr[] = new int[n];
       System.out.println("Enter array elements");
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
      System.out.println("Array elements are:");
      for(int i=0;i<arr.length;i++){
          System.out.println(arr[i]);
      }
      int max=arr[0];
      for(int i=0;i<arr.length;i++){
          if(max<arr[i])
          max=arr[i];
      }
      System.out.println("Largest element is: "+max);

    //how many times element occurred
      int count=0;
      for(int i=0;i<arr.length;i++){
          if(max==arr[i]){
              count++;
         }
      }
      System.out.println("Element "+max+" occured "+count+" times");
	}

}
