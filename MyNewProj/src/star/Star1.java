package star;
import java.util.*;
public class Star1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Output is: ");
        for(int i =0; i<= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
	}
}
