package labassignment;
class MyDate7{
	 int day;
	 String month;
	
	MyDate7(){
		this(0,null);
	}
	MyDate7(int day){
		this(day,null);		
	}
	MyDate7(String month){
		this(0,month);
	}
	MyDate7(int day,String month){
		this.day=day;
		this.month=month;
	}
	void date() {
		System.out.println(day+" "+month);
	}

}

public class Lab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate7 md = new MyDate7();
		md.day=2;
		md.month="July";
		md.date();
		
	}

}
