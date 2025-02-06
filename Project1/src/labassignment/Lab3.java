package labassignment;
class MyDate3{
	private int day,year;
	private String month;
	
	MyDate3(){
	
	}

	MyDate3(int day,String month,int year){
		this.day = day;
		this.year =year;
		this.month=month;
	}
	void showDate() {
		System.out.println(day+"th "+month+" "+year);
	}
}

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyDate3 d1=new MyDate3(28,"October",1997);
		d1.showDate();
	}

}
