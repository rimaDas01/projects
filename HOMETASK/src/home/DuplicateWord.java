package home;

//import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "What is your your name?";
		System.out.println("Before removing duplicate:\n"+s);
		String[] arr = s.split(" ");
		Set<String> mySet = new LinkedHashSet<>();
		for(String element: arr) {
			mySet.add(element);
		}
		System.out.println("After removing duplicate: ");
		Iterator itr = mySet.iterator();
		while(itr.hasNext())
		{
			System.out.print(" "+ itr.next());
		}
	}
}
