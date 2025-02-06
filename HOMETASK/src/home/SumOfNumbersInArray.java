package home;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SumOfNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a = {10,20,30};
		int sum=0;
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		for(int element:list) {
			sum=sum+element;
		}
		System.out.println("Sum = "+sum);

		
		
		
//		int sum=0;
//		
//		for(int i:a) {
//			sum=sum+i;			
//		}
//		System.out.println("Sum = "+sum);
	}

}
