package home;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> emp = new HashMap<>();
		emp.put(101,"Rima");
		emp.put(102,"Aryan");
		emp.put(103,"Arman");
		emp.put(104,"Richa");
		/* Entry Set
		 Set<Entry<Integer,String>> mySet = emp.entrySet();
		Iterator<Entry<Integer,String>> itr= mySet.iterator();

		while(itr.hasNext())
		{
			Entry<Integer,String> en = itr.next();
			System.out.println(en.getValue()+": "+en.getKey());
		}*/
		
		//Ket set
//		Set<Integer>myKeySet = emp.keySet();
//		for(int i : myKeySet)
//		{
//			System.out.println(i);
//		}
		
//		System.out.print(emp.values());
		//value set
//		 for(Entry<Integer,String> en : emp.entrySet())
//		 {
//			 String values = en.getValue();
//			 System.out.println(values);
//		 }
		
	}
}
