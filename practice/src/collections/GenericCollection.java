package collections;

import java.util.*;

class Box<T>{
	private List<T> items = new ArrayList<>();
	
	public void add(T item) {
		items.add(item);
	}
	
	public T get(int index) {
		return items.get(index);
	}
}
public class GenericCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box<String> stringBox = new Box<>();
		stringBox.add("Rima");
		stringBox.add("Java Developer");
		System.out.println(stringBox.get(0));
		Box<Integer> intBox = new Box<>();
		intBox.add(100);
		System.out.println(intBox.get(0));
		
	}

}
