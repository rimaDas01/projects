package features;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="hello";
		
		/*String s2= new String("hello");  //1 ref, 2 objs
		String s3 = s2;
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s1));*/
		
		System.out.println(s1.concat(" world"));
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.charAt(4));
		System.out.println(s1.substring(0,4));
		System.out.println(s1.contains("xyz"));
		System.out.println(s1.compareTo("HELLO"));

	}

}
