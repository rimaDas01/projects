package gen;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSportEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Set<String> sport = new HashSet<>(); //no order
//		Set<String> sport = new LinkedHashSet<>(); //preserves order
		Set<String> sport = new TreeSet<String>(); //sorts elements in ascending order
		sport.add("Cricket");
		sport.add("VolleyBall");
		sport.add("Rugby");
		sport.add("Football");
		sport.add("Ludo");
		sport.add("PUBG");
		sport.add("Cod");		
		
//		sport.removeAll(sport);
		
		
//		Without iterator
//		System.out.println(sport);
		
		
		//Using iterator concept
		Iterator it=sport.iterator();
		while(it.hasNext()) {
			String obj=(String) it.next();
			System.out.println(obj);
			/*if(obj.equals("Ludo"))
				it.remove();
			else
				System.out.println(obj);*/			
		}

	}

}
