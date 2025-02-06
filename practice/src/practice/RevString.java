package practice;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "New";
		String s1= "";
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		}
		System.out.println("Reverse String- "+s1);

	}

}
