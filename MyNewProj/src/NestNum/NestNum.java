package NestNum;

public class NestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 181;
		String num = Integer.toString(n);
		if ((num).contains("0")) 
			System.out.println("It has 0 and so it is a Nest number");
		else
			System.out.println("It has no 0 so it is not a Nest number");
	}

}
