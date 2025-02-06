/*
 2. Create new Java project with following classes:
Player- POJO containing fields name(String) and score(Integer)
PlayerComparator- implements Comparator<Player> 
PlayerMain- contains main(){}
//In main() write logic to read file contents and convert the line read from file into Player object
//Add each player object into ArrayList object
//Sort ArrayList and show result
//Hint: use split() method of string class to get string splited up into fields,
example Consider:
 
String entry="Sachin, 100";
String[]fields=entry.split(","); 
//split() method will split the entry on comma(,) and the fields will be stored in 'fields' array
//'Sachin' will be stored in fields[0]
//100 will be stored in fields[1]
//from these two array elements, create object of Player

*/

package play;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class Player{
	private String name;
	private Integer score;
	
	public Player(String name, Integer score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", score=" + score + "]";
	}	
}

class PlayerComparator implements Comparator<Player>{

	@Override
	public int compare(Player p1, Player p2) {
		// TODO Auto-generated method stub
		if((p1.getName()).compareTo(p2.getName())<1)
			return-1;     //ascending order if -1 and 1 combo
		else if ((p1.getName()).compareTo(p2.getName())>1) 
			return 1;     //descending order if 1 and -1 combo
		else
			return 0;
	}
	
}

public class PlayerMain {
	
	
/*	public static void serialize(Player[] p) throws Exception {
	
	
			FileOutputStream fos = new FileOutputStream("C:\\Users\\rima.das\\eclipse-workspace\\IO\\Player.txt");
			ObjectOutput oos = new ObjectOutputStream(fos);  //oos contains fos
			oos.writeObject(p);                             
			System.out.println("Object persisted or serialized!");
}
*/

//DESERIALIZATION
//public static void deserialize(PlayerRecord[] rec) throws Exception {
	
//	public static void deserialize() throws Exception {
//	
//			System.out.println("Reading object from persistent form");
//			FileInputStream fis = new FileInputStream("PlayerRecord.dat");
//			ObjectInputStream ois = new ObjectInputStream(fis);
//			PlayerRecord[] newRec = (PlayerRecord[])ois.readObject();
//
//			System.out.println("Player details: ");
//			for(PlayerRecord element: newRec)
//				System.out.println(element);
//	
//}

	public static void main(String[] args) throws NumberFormatException, IOException, Exception {
		// TODO Auto-generated method stub
		
		List<Player> playerList = new ArrayList<>();
		
		FileReader fr = new FileReader("C:\\Users\\rima.das\\eclipse-workspace\\IO\\Player.txt");
		BufferedReader bfr = new BufferedReader(fr);
		
		String line;
		while((line=bfr.readLine())!=null) {
			String[]fields = line.split(",");
			Player p = new Player(fields[0],Integer.parseInt(fields[1]));
			playerList.add(p);	
		}
		//for sorting
		Collections.sort(playerList, new PlayerComparator());
		
		
		
//		iterate through collection, read each object from collection,
//		extract name and score from object using getters and put both values in string variable separated by comma and 
//		then write into file


		
		
		
		//data written into file
				FileWriter fw=new FileWriter("myfile1.txt",true); //true is used to write old content along with new content
				fw.write(line);
				fw.flush();
		
		for(Player p: playerList)
			System.out.println(p);
		
		
		
		
		//serialize
		/*FileOutputStream fos = new FileOutputStream("C:\\Users\\rima.das\\eclipse-workspace\\IO\\Player.txt");
		ObjectOutput oos = new ObjectOutputStream(fos);  //oos contains fos
		oos.writeObject(playerList);                             
		System.out.println("Object persisted or serialized!");
		
		//deserialize
		System.out.println("Reading object from persistent form");
		FileInputStream fis = new FileInputStream("C:\\Users\\rima.das\\eclipse-workspace\\IO\\Player.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Player[] newRec = (Player[])ois.readObject();

		System.out.println("Player details: ");
		for(Player element: newRec)
			System.out.println(element);*/
		
	}

}


