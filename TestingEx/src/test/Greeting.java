package test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Greeting {
	
	public String sayHello() {
		return "Hello";
	}
	
	public String getDate() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		return sdf.format(date);
	}

}
