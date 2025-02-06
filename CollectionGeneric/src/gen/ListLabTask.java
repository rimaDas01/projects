package gen;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListLabTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List indoor,outdoor,sport;
		
		indoor=new LinkedList<>();
		indoor.add("Chess");
		indoor.add("Carrom");
		
		outdoor=new LinkedList<>();
		outdoor.add("Cricket");
		outdoor.add("VolleyBall");
		outdoor.add("Football");
		
		sport=new LinkedList<>();
		sport.addAll(indoor);
		sport.addAll(outdoor);
		
//		System.out.println(indoor);
//		System.out.println(outdoor);
//		System.out.println(sport);
		
	
		ListIterator<String>it2=sport.listIterator();
		System.out.println("Forward: ");
		while(it2.hasNext())
			System.out.println(it2.next());
		System.out.println("\nReverse: ");
		while (it2.hasPrevious())
			System.out.println(it2.previous());
		

	}

}
