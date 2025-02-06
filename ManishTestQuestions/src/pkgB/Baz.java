package pkgB;

import pkgA.Foo;

public class Baz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foo f = new Foo();
//		System.out.print(" "+f.a); 
//		--> a is default in Foo
//		System.out.print(" "+f.b);
//		-->b is protected in Foo
		System.out.print(" "+f.c);
		//-->c is public so it works
	}
}
