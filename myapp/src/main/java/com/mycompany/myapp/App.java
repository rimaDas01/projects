 package com.mycompany.myapp;

@FunctionalInterface
interface StringOperation{
	String reverse(String string);
}
public class App 
{
    public static void main( String[] args ){
    	/*StringOperation newString = new StringOperation() {
			
			public String reverse(String string) {
				// TODO Auto-generated method stub
				StringBuilder sb= new StringBuilder(string);
				return sb.reverse().toString();
			}
		};
		System.out.println(newString.reverse("EspirE"));
    */
    	
    	//using lambda exp
    	StringOperation newString =(string)->new StringBuilder(string).reverse().toString();
    	System.out.println(newString.reverse("EspirE"));
    }
}
