/*//task
 
Consider a file containing players record. 
Record contains name of the player and ODI score separated by comma.
example, 
Sachin, 100
Virat, 99
...
 
Write Java application to read these records from file and store them in the ArrayList
Get the list sorted based on player name and display sorted records
 
//Soln steps:
1. Create text file (Player.txt) and add following entries
 
Sachin, 100
Virat, 99
 
...
 
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


package ioex;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PlayerMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//1. Create text file (Player.txt) and add following entries
		File file = new File("Player.txt");
		file.createNewFile();
		System.out.println("File created!");
		
		FileWriter fw =new FileWriter(file);
		
		fw.write("\nVirat,100");
		fw.write("\nSachin,103");
		fw.write("\nRohit,98");
		fw.write("\nRahul,88");
			
		System.out.println("File write operation completed!");
		fw.flush();
		

	}

}
