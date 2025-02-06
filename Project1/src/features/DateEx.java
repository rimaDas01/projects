package features;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class DateEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		/*Date date=new Date();
//		System.out.println(date);
//		System.out.println(date.getTime()/(1000*60*24));

		//for any particular eg date/month/year
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String strdate =sdf.format(date);     //date to string-->format
		System.out.println(strdate);
		
		System.out.println("Enter date: ");
		String userDate= new Scanner(System.in).nextLine();
		Date date2= sdf.parse(userDate);  //string to date--> parse    //to retrieve particular day
		System.out.println(date2);*/
		
		LocalDate date = LocalDate.now();
//		System.out.println(date);
//		System.out.println(LocalDate.of(2022, 8, 15));
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		String strDate=dtf.format(date);
		System.out.println(strDate);
	}

}
