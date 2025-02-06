package test;

import java.util.HashSet;

//1.Write Java Program to find Second Largest Number in an Array
//
//2.Write a Java program to remove all duplicate elements from a list using streams.
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {11,2,3,3,6,0};
		
		HashSet<Integer> set= new HashSet<>();
		
//		for(int i : arr1) {
//			set.add(arr1[i]);
//		}
		
		for(int i=0; i<arr1.length; i++) {
			set.add(arr1[i]);
		}
		System.out.println("New Array"+set);

	}

}
