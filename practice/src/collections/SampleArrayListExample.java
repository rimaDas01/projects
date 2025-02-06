package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SampleArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List<String> list = new ArrayList<>();
//		System.out.println(list.getClass().getName());
//		
//		//using aslist()
//		List<String> list1 = Arrays.asList("Monday","Tuesday");
//		System.out.println(list1.getClass().getName());
//		list1.set(1, "Wednesday");
//		System.out.println(list1.get(1));
//		
//		
//		//storing string type array in a list
//		String[] stringArray = {"Apple","Banana","Cherry"};
//		List<String> list2 = Arrays.asList(stringArray);
//		System.out.println(list2.getClass().getName());
//		
//		//storing on list in another list
//		List<String> list4 = new ArrayList<>(list2);
//		list4.add("Mango");
//		System.out.println(list4);
//		
//		//using of() for storing in list of() is unmodifiable 
//		List<Integer> list3 = List.of(1,2,4);
//		
//		//adding in list
//		List<Integer> listX = new ArrayList<>();
//		listX.add(1);
//		listX.add(2);
//		List<Integer> listY = List.of(1,9,10);
//		
//		listX.addAll(listY);
//		System.out.println(listX);
		
		
		//using Integer object to remove
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(1);
		list.add(3);
//		
//		list.remove(Integer.valueOf(1));
//		System.out.println(list);
//		
//		//storing list in a form of object type of array
//		Object[] arr =list.toArray();
//		//storing list in a form of integer/string type of array
//		Integer[] arr1=list.toArray(new Integer[0]);
		
		
		//sorting a list by the help of collection
//		Collections.sort(list);  //this we can achieve by the help of comparator also, later it is discussed
//		System.out.println(list);
		
		//ordering or sorting by Comparator (by ascending order)
//		list.sort(null);
//		System.out.println(list);
		
//		List<String> words = Arrays.asList("banana","apple","date");
//		words.sort(null);
//		System.out.println(words);
		
		
		
		

	}

}
