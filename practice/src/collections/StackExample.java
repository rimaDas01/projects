package collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack);
		Integer removedElement= stack.pop();
		System.out.println(stack);
		Integer peek = stack.peek(); //peek is used to see the topmost element of the stack
		System.out.println(peek);
		System.out.println(stack);
		
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		int search = stack.search(1); //it starts its count from last of the stack
		System.out.println(search);
	}

}
