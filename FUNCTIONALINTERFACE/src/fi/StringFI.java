package fi;

@FunctionalInterface
interface AcceptString{
	String s1(String line);
}

public class StringFI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AcceptString s = line->{
			String revLine="";
			for(int i= line.length()-1;i>=0;i--) {
				revLine= line.charAt(i)+revLine;
			}
			
			return revLine;
		};

		System.out.println(s.s1("ESPIRE"));
	}

}
