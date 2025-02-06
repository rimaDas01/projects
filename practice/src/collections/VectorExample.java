package collections;

import java.util.LinkedList;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> vector = new Vector<>(7);
		vector.add(1);
		vector.add(6);
		vector.add(3);
		System.out.println(vector.capacity());
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(7);
		list.add(9);
		Vector<Integer> vector1 = new Vector<>(list);
		System.out.println(vector1);
		
		for(int i = 0; i<vector1.size(); i++) {
			System.out.println(vector1.get(i));
		}
		
		
	}

}
