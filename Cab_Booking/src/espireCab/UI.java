package espireCab;
import java.sql.SQLException;
import java.util.Scanner;

public class UI {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		CabServiceDAOImpl test=new CabServiceDAOImpl();
		PassengerServiceDAOImpl test1=new PassengerServiceDAOImpl();
		BookingServiceDAOImpl test2=new BookingServiceDAOImpl();
		UserDAOServiceImpl test3=new UserDAOServiceImpl();
	
		
		//menu-based
	//	String passwordAdmin="CABDEKH";
		//String passwordPass="CABBOOKKAR";
	//	System.out.println("Enter user ADMIN or PASSENGER or NEW USER");
		
		
		System.out.println("Enter your password for ADMIN/PASSENGER AND 'NEW USER' TO CREATE ACCOUNT");
		String password= sc.nextLine();
		
		switch(password) {
		case "SHOWCAB":
			System.out.println("Welcome ADMIN");
			System.out.println("1.to show all cabs\n2.to show all passengers\n3.show all booking");
			int choice1=sc.nextInt();
			switch(choice1) {
			case 1: 
				test.showAllCabs();
				break;
			case 2:
				test1.showAllPassenger();
				break;
			case 3:
				test2.showAllBooking();
				break;
			}
			break;
		case "BOOKCAB":
			System.out.println("Welcome Passenger");
			System.out.println("1.to book cab\n2.to cancel ride");
			int choice2=sc.nextInt();
			switch(choice2) {
			case 1:
				test1.bookCab();
				break;
			case 2:
				test1.cancelCab();
				break;
			}
			break;
		case "NEW USER":
			test3.addnewUser();
			break;
		default:
			System.out.println("Enter right choice");
		}
		
			
	}

}
