package gen;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class sportListLabTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List sportName;
		Scanner sc = new Scanner(System.in);
		sportName=new LinkedList<>();
		
		
		System.out.println("Sports names are: ");
		sportName.add("Ludo");
		sportName.add("PUBG");
		sportName.add("Chess");
		sportName.add("Cricket");
//		sportName.add(1,"Tennis");
		sportName.set(2, "Kabaddi");
		System.out.println(sportName);	
		System.out.println(sportName.get(2));
		
		
		
		/*ListIterator<String>it= sportName.listIterator();
		while(it.hasNext()) {
			String sp=(String) it.next();
			if(sp.equalsIgnoreCase(s))
				{System.out.println("Game found");
			break;
				}
			else
				System.out.println("Game not found");
			break;
		}
		*/
		
		/*
		
		if(sportName.contains(s))
			System.out.println("Game found!");
		else
			System.out.println("Game not found..");*/
		
//		List<String>list=Arrays.asList("Cricket","Football","Vollyball","Kabaddi");
//		System.out.println("Enter sport name: ");
//		String s=sc.nextLine();
		
		/*Following operations will not be supported on list created above
		list.add("Football");
		list.remove("Football");*/
	}

}
