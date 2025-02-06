package serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class PlayerRecord implements Serializable{
	private String playerName;
	private int centuries;
	
	
	public PlayerRecord() {
		// TODO Auto-generated constructor stub
	}
	public PlayerRecord(String playerName, int centuries) {
		super();
		this.playerName = playerName;
		this.centuries = centuries;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getCenturies() {
		return centuries;
	}
	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}
	@Override
	public String toString() {
		return "" + playerName + "," + centuries + " ";
	}	
	
}

public class PlayerRecordMain {
	
	//SERIALIZATION
	public static void serialize(PlayerRecord[] rec) throws Exception {
		
//		public static void serialize() throws Exception {
		
		
				FileOutputStream fos = new FileOutputStream("PlayerRecord.dat");
				ObjectOutput oos = new ObjectOutputStream(fos);  //oos contains fos
				oos.writeObject(rec);                             
				System.out.println("Object persisted or serialized!");
	}
	
	
	//DESERIALIZATION
//	public static void deserialize(PlayerRecord[] rec) throws Exception {
		
		public static void deserialize() throws Exception {
		
				System.out.println("Reading object from persistent form");
				FileInputStream fis = new FileInputStream("PlayerRecord.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);
				PlayerRecord[] newRec = (PlayerRecord[])ois.readObject();

				System.out.println("Player details: ");
				for(PlayerRecord element: newRec)
					System.out.println(element);
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		PlayerRecord[] rec = new PlayerRecord[10];
		rec[0]=new PlayerRecord("Virat",98);
		rec[1]=new PlayerRecord("Rohit",78);
		rec[2]=new PlayerRecord("Sachin", 102);
		rec[3]=new PlayerRecord("Sourav",100);
		rec[4]=new PlayerRecord("Rahul",67);
		rec[5]=new PlayerRecord("Rishav",80);
		rec[6]=new PlayerRecord("Lohit",45);
		rec[7]=new PlayerRecord("Samy",56);
		rec[8]=new PlayerRecord("Hardik",99);
//		rec[9]=new PlayerRecord("ABD",97);
		rec[9]=new PlayerRecord("Shikhar",77);
		
		
		serialize(rec);
		deserialize();
//		deserialize(rec);
		
		
		
		
	}

}
