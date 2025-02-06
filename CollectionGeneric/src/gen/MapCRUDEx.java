package gen;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapCRUDEx {
	

	Map<String,Double>map=new HashMap<>();
	
	public void addEntry(String city,Double temp) {
		map.put(city,temp);
		System.out.println("Entry added in map.");
	}
	
	
	public void showEntries() {
		Set<Entry<String,Double>> entries=map.entrySet();
		
		if(entries.size()==0)
			System.out.println("There are no entries!!");
		else {
		Iterator<Entry<String,Double>> it=entries.iterator();
		System.out.println("\nFollowing cities are:");
		while(it.hasNext()) {
			Entry<String,Double>entry=it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		}
	}
	
	
	
	public void deleteEntry(String city) {
		System.out.println("\nCurrent entries are:");
		if(map.containsKey(city))
			map.remove(city);
		else
			System.out.println("Mentioned city doesnot exist.");
	}
	
	public void searchEntry(String city) {
		Set<Entry<String,Double>> entries=map.entrySet();
		Iterator<Entry<String,Double>> it=entries.iterator();
		while(it.hasNext()) {
			if(map.containsKey(city)) {
				System.out.println("City found and city name is: "+city);
			break;
			}
			else
				System.out.println("Cannot find the city...");
		}
		
	}
	
	public void editEntry(String city,Double temp) {

		 if(map.containsKey(city)) {
	            map.replace(city, temp);
	            System.out.println("Entry with specified city edited");
	        }
	        else 
	            System.out.println("Entry with specified city name not found");
	        
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MapCRUDEx ex =new MapCRUDEx();
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("\nEnter a valid choice:\n1 to add\n2 to show\n3to delete\n4to edit\n5to search");
			int choice = sc.nextInt() ;
			switch(choice) {
			case 1:
				ex.addEntry("Delhi", 35.8);
				ex.addEntry("Mumbai", 26.0);
				ex.addEntry("Kolkata", 36.0);
				ex.addEntry("Bengaluru", 26.6);
			break;
			
			case 2:
				ex.showEntries();
				break;
			case 3:
				ex.deleteEntry("Delhi");
				ex.showEntries();
				
				break;
			case 4:
				ex.editEntry("Kolkata", 35.50);
				break;
			case 5:
				ex.searchEntry("Delhi");
				break;
			default:
				System.out.println("Invalid choice!!!");	
			}
		
		}while(true);
	}

}