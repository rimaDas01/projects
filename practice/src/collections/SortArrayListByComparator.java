package collections;

import java.lang.reflect.Array;
import java.util.*;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		
		//ascending order
//		return s1.length() - s2.length();
		
		//descending order
		return s2.length() - s1.length();
	}

}

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		
		//ascending order
//		return o1 - o2;
		
		//descending order
		return o2-o1;
	}
}

public class SortArrayListByComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("banana", "apple", "date");
		words.sort(new StringLengthComparator());
		System.out.println(words);

		List<Integer> numbers = Arrays.asList(4, 2, 3);
		numbers.sort(new MyComparator());
		System.out.println(numbers);
	}
}
