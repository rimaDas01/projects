package gen;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Sport{
	private String name;
	private Integer players;
	
	//constructors
	public Sport() {
		
	}
	public Sport(String name,Integer players) {
		this.name=name;
		this.players=players;
	}
	//setter getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPlayers() {
		return players;
	}
	public void setPlayers(Integer players) {
		this.players = players;
	}

	//toString method
	@Override
	public String toString() {
		return " SportsName=" + name + ", players=" + players + "";
	}
	
}

public class ObjectMapEx {

	Map<Integer,Sport>map= new HashMap<>(); //integer(it takes object's hashcode) type of key and sport type of value
	
	public void addEntry(Integer key,Sport value) {
		map.put(key, value);
		System.out.println("Entry added in map.");
	}
	
	
	public void showEntries() {
		Set<Entry<Integer,Sport>>entry= map.entrySet();
		Iterator<Entry<Integer,Sport>>it=entry.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); 
		}
	}
	
	
	
	public void editEntries(Integer key,Sport value) {
		if(map.containsKey(key)) {
			map.replace(key, value);
			System.out.println("Edit successful!");
		}
		else
			System.out.println("Edit unsuccessful!!");
		
	}
	
	public void deleteEntry(Integer key) {
		

		System.out.println("Entry removed");
		
		 
			if(map.containsKey(key)) {
				map.remove(key);
				System.out.println("Sports available after deleting: ");
			}
			else
				System.out.println("Game doesnot exist!");
		
	}
	
	public void searchEntry(Integer key) {
		if(map.containsKey(key))
		{
			System.out.println("Search successful!");
			System.out.println(key+" "+map.get(key));
		}
		else
			System.out.println("Cannot find it");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Sport sp = new Sport("Cricket",11);
//		System.out.println(sp);
		Scanner sc= new Scanner(System.in);
		Sport sp1 = new Sport("Cricket",11);
		Sport sp2=new Sport("Chess",2);
		Sport sp3=new Sport("Ludo",9);
		Sport sp4=new Sport("Hockey",10);
		
		ObjectMapEx ex=new ObjectMapEx();
		
		do {
			System.out.println("Enter your choice:\\n1 to add\\n2 to show\\n3to delete\\n4to edit\\n5to search");
			int choice =sc.nextInt();
			switch(choice) {
			case 1:
				ex.addEntry(sp1.hashCode(), sp1);
				ex.addEntry(sp2.hashCode(), sp2);
				ex.addEntry(sp3.hashCode(), sp3);	
				break;
			case 2:
				ex.showEntries();
				break;
			case 3: 
				ex.deleteEntry(sp3.hashCode());
				ex.showEntries();
				break;
			case 4:
				ex.editEntries(sp3.hashCode(),sp4);
			case 5:
				
				ex.searchEntry(sp2.hashCode());
				default:
					System.out.println("Invalid choice");
			}
		
		}while(true);
		

	}

}
