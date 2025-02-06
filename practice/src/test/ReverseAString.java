package test;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";
		String newStr="";
		for(int i=str.length()-1; i>=0; i--) {
			newStr=newStr+str.charAt(i);
		}
		System.out.println("Reverse output");
		System.out.println(newStr);
	}

}
