package gen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Vector;

public class ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list;
//		list= new Vector<>();
//		list=new ArrayList<>();
		list = new LinkedList<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of games");
		int n= sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Enter name of sports: ");
			String sport =sc.next();
			
			
			list.add(sport);
		}
		
		/*list.add("Cricket");
		list.add("VolleyBall");
		list.add("Rugby");
		list.add("Football");
		list.add("Ludo");
		list.add("PUBG");
		list.add("Cod");
		list.add("PUBG");*/
		
//		Iterator<String> it=list.iterator();
		
		
		
		/*while(it.hasNext()) {
			String sport=it.next();
			System.out.println(sport);
		}*/
		
		ListIterator<String>it2;
		it2=list.listIterator();
		
		System.out.println("Traverse in fwd direction");
		while(it2.hasNext())
			System.out.println(it2.next());
		
		System.out.println("Traverse in reverse direction");
		while(it2.hasPrevious())
			System.out.println(it2.previous());
	}

}
