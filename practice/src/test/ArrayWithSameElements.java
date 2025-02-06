package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayWithSameElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {2,3,0,6,9};
		ArrayList<Integer> commonList= new ArrayList<>();
				
		for(int i=0; i <arr1.length; i++) {
			for(int j =0;  j<arr2.length; j++) {
				if(arr1[i] ==arr2[j]) {
					commonList.add(arr1[i]);
				}
			}
		}
	System.out.println("Array with common elements"+commonList);
	}

}
