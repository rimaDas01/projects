package gen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ListCRUDEx {
	
	List<String>sportList =new ArrayList<>();
	int index;
	Scanner sc=new Scanner(System.in);
	public void addSport(String sport) {
		//code to add sport to list
		sportList.add(sport);
		System.out.println("Sport added");
	}
	
	public void showAllSports() {
		Iterator<String> itr = sportList.iterator();
		System.out.println("Sports available are: ");
        while(itr.hasNext()) {
            System.out.println(itr.next()+" ");
        }
		System.out.println(sportList);	
}
	public void searchSport(String sport) {
		//code to search for sport
//		Iterator<String> itr1 = sportList.iterator();
		String s=sc.nextLine().toUpperCase();
		if(sportList.contains(s))
			System.out.println("Game found!");
		else
			System.out.println("Game not found..");
//			System.out.println("Sport found");
	}
	
	public void editSport(int index,String sport) {
//		index=sc.nextInt();
		sportList.set(index, sport);
		System.out.println("Sport edited");
	}
	
	public void deleteSport(String sport) {
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create menu to call above methods
		Scanner sc=new Scanner(System.in);
		ListCRUDEx l=new ListCRUDEx();

		do {
			System.out.println("\nEnter choice:\nadd\nshow\nsearch ");
			String choice=sc.nextLine();
			

		switch(choice.toLowerCase()) {
			case "add":
				System.out.println("Enter sport to add in the list");
				l.addSport(sc.nextLine().toUpperCase());
				
				break;
			case "show": 
				l.showAllSports();
				break;
			case "search":
				System.out.println("Search for sport: ");
				l.searchSport("");
			
				break;
				
			case "edit":
				System.out.println("Enter index");
				int index=sc.nextInt();
				System.out.println("Enter sports name");
				String s=sc.nextLine();
				l.editSport(index, "");
				break;
			default: 
					System.out.println("Not a valid choice!");
				
		}
		}while(true);
	}

}
