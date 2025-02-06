package gen;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Set set;  //non-generic collection because we have not not specified any data type
		set = new HashSet();*/
		
		Set<String> set;
		set= new HashSet<>();
		set.add("1234");
		set.add(String.valueOf(true));
		set.add("1234");
		set.add("abcd");
		set.add(String.valueOf('$'));
		set.add("123.45");
		set.add("abcd");
		set.add("1010L");
		set.add("1234");
		set.add("Rima");
		set.add("0X12");
		set.add("89");
		set.add("Polo and Lolo");
		set.remove("1234");
		
		
//		System.out.println(set); //it uses hashing technique //the output comes in random order

		/*for(Object obj:set) //Object is written as it contains all dtaypes, so object type of data
			System.out.println(obj);
		*/
		
		Iterator it=set.iterator();
		
		/*while(it.hasNext()) {     //for non-generic
			Object obj=it.next();
			if((obj.equals(1010L))||(obj.equals(89)))
				it.remove();
			else
				System.out.println(obj);
			*/
		
		while(it.hasNext()) {      //for generic
			String obj=(String) it.next();
			if((obj.equals("1010L"))||(obj.equals("89")))
				it.remove();
			else
				System.out.println(obj);
		}
;	}

}
