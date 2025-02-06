package excep;


import java.util.Scanner;

public class ExcepHandling {
	public static void main(String[] args) {
		int []arr= {100,9,20,19,80};
		
		try {
			System.out.println("Enter index value: ");
			Scanner sc = new Scanner(System.in);
			int i =  sc.nextInt();
			System.out.println("Enter divisor value: ");

			float divisor = sc.nextFloat();
//			System.out.println(arr[5]);
			System.out.println(arr[i]/divisor);
			
			//CODE AHEAD WILL NOT EXECUTE AFTER EXCEPTION OCCURS 

		}/*catch(ArrayIndexOutOfBoundsException el) {
//			el.printStackTrace();
//			System.out.println(el.getMessage());
			System.out.println("invalid array index referenced.");
		}*/
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e2){
			System.out.println(e2.getMessage());
		}
		catch(Exception e3) {   //general exception block must be the last catch block
//			System.out.println(e3.getCause());  
			System.out.println(e3.getMessage());
		}
		finally {
		
			System.out.println("processing done!");
		}
		
	}
}
