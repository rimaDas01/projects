package oop;

class Sports{
	private String name;
	private int players;
	private boolean indoor;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName( ) {
		return name;
	}
	public void setPlayers(int players) {
		this.players=players;
	}
	public int getPlayers() {
		return players;
	}
	public void setIndoor(boolean indoor) {
		this.indoor=indoor;
	}
	public boolean isIndoor() {
		return indoor;
	}
}
public class SportProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sports s1= new Sports();
		Sports s2=new Sports();
		s1.setName("Virat Kohli");
		s1.setPlayers(12);
		s1.setIndoor(false);
		s2.setName("Viswanathan Anand");
		s2.setPlayers(2);
		s2.setIndoor(true);
		System.out.println("Name: "+s1.getName());
		System.out.println("Players: "+s1.getPlayers());
		System.out.println("Indoor or Outdoor: "+(s1.isIndoor()?"Indoor":"Outdoor"));

		System.out.println("Name: "+s2.getName());
		System.out.println("Players: "+s2.getPlayers());
		System.out.println("Indoor or Outdoor: "+(s2.isIndoor()?"Indoor":"Outdoor"));

		
	}

}
