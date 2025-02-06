package greetmain;

import greet.Greeting;

public class GreetingMain {

	public static void main(String[] args) {
		Greeting g = new Greeting();
		String s= g.sayHello();
		System.out.println(s);
	}
}
