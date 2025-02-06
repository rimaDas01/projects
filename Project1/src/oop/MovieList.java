package oop;

class Movie{
	private String title;
	private double budget;
	private boolean universal;
	
	public void setTitle(String title) {
		this.title=title;
	}
	public void setBudget(double budget) {
		this.budget=budget;
	}
	public void setUniversal(boolean universal) {
		this.universal=universal;
	}
	public String getTitle() {
		return title;
	}
	public double getBudget() {
		return budget;
	}
	public boolean isUniversal() {
		return universal;
	}
	
}

public class MovieList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m1,m2;
		m1=new Movie(); m2=new Movie();
		m1.setTitle("Daabang");
		m1.setBudget(3000);
		m1.setUniversal(false);
		m2.setTitle("Avengers");
		m2.setBudget(123000.90);
		m2.setUniversal(true);
		
		System.out.println("Movie name: "+m1.getTitle());
		System.out.println("Movie budget: "+m1.getBudget());
		System.out.println("Universality: "+m1.isUniversal());
		System.out.println("Movie name: "+m2.getTitle());
		System.out.println("Movie budget: "+m2.getBudget());
		System.out.println("Universality: "+m2.isUniversal());
		
	}

}
