package labassignment;

class MyDate{
	private int day,month,year;
	
	public void initDate(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public String getDate() {
		return(day+"-"+month+"-"+year);
	}
}

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate d = new MyDate();
		d.initDate(1,9,2022);
		System.out.println(d.getDate());
	}

}
