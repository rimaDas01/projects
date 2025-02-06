package collections;
import java.util.*;

public class SortArrayListByLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("banana", "apple", "date");
		words.sort((a,b)-> a.length()-b.length());
//		words.sort(null);
		System.out.println(words);

		List<Integer> numbers = Arrays.asList(4, 2, 3);
		numbers.sort((a,b)->b-a);
//		numbers.sort(null);
		System.out.println(numbers);
	}
}
