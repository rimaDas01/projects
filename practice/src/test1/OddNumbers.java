package test1;

import java.util.Arrays;
import java.util.List;

//Find the Odd Numbers in the List 
//List a = {4,5,7,8,9,22}
 
//Use java 8 feature to make this 
 

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> a = Arrays.asList(4,5,7,8,9,22);
		 a.stream().filter(odd -> odd%2!=0).forEach(System.out::println);
		

	}

}
