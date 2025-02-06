package home;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class JukeBox1 {

	ArrayList<String>	songList = new ArrayList<String>();
	public static void main(String[] args) {
		
		   new JukeBox1().go();
	}
	public void go(){
		getSongs();
		System.out.println(songList);
	}
	 void getSongs() {
		 try{
				File file=new File("C:\\Users\\rima.das\\Desktop\\29septSME\\src\\com\\espire\\training\\SongList.txt");
				BufferedReader reader = new BufferedReader(new FileReader(file));
				String line=null;
				while((line=reader.readLine())!=null){
					addSong(line);
			    }
		 }
				catch(Exception e){
					System.out.println(e.getMessage());
				}
	 }
	 void addSong(String lineToParse){
			String[] song = lineToParse.split("/");
			songList.add(song[0]);
		}
	 
}






