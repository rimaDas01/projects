package collections;

import java.util.ArrayList;

public class CollectionFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1= new ArrayList<>();
		ArrayList<Integer> l2= new ArrayList<>(3);
		
		l1.add(0);
		l1.add(1);
		l1.add(7);
		l1.add(2, 8);
//		System.out.println(l1);
//		System.out.println(l1.contains(9));
//		l2.add(22);
//		l2.add(65);
//		l1.addAll(2, l2);
//		System.out.println(l2);
//		System.out.println(l1);
//		l1.clear();
//		System.out.println(l1);
//		System.out.println(l1.indexOf(1));
//		System.out.println(l1.lastIndexOf(7));
		
//		l1.set(3,90);
//		System.out.println(l1);
		
//		for(int i=0;i<l1.size(); i++) {
//			System.out.print(l1.get(i));
//			System.out.print(",");
//		}
		
		//using forEach
		for(int n : l1){
			System.out.println(n);
		}
		
	}
}
