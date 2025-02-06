package collections;

import java.util.Arrays;
import java.util.LinkedList;

//these things are not needed in java
//class Node{
//	public int value;
//	public Node next;
//}
//these things are not needed in java

public class LinkedListExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//these things are not needed in java
//		Node node1 = new Node();
//		Node node2 = new Node();
//		node1.value = 1;
//		node1.next = node2;
//		node2.next = null;
		//these things are not needed in java
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.get(2); //0(n)
		linkedList.addFirst(0); //0(1)
		linkedList.addLast(4); //0(1)
		linkedList.getFirst();
		linkedList.getLast();
		System.out.println(linkedList);
		linkedList.removeIf(x -> x%2 ==0);
		System.out.println(linkedList);
		
		//random adding arrays to list
		LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog","Bear"));
		LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog","Lion"));
		animals.removeAll(animalsToRemove);
		System.out.println(animals);
	}
}
