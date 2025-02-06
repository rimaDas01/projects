package labassignment;

class MyDate2{
	private int day,year;
	public String month;
	
	public void setDay(int day) {
		this.day=day;
	}
	public int getDay() {
		return day;
	}
	public void setMonth(String month) {
		this.month=month;
	}
	public String getMonth() {
		return month;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public int getYear() {
		return year;
	}
}
public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyDate2 date = new MyDate2();
		date.setDay(28);
		date.setMonth("October");
		date.setYear(1997);
		System.out.println("Day: "+date.getDay());
		System.out.println("Month: "+date.getMonth());
		System.out.println("Year: "+date.getYear());

	}

}
