package com.revision;

public class methods {
	
	static int logic(int x,int y) {
		int z = 0;
		if(x> y) {
			z=x+y;
		}
		else {
			z=(x+y)*5;
		}		
		return z;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =5,b = 7, c;
		c  = logic(a,b);
		int a1 =6, b1 = 7, c1;
		c1 = logic(a1, b1);
		System.out.println("This is c "+c);
		System.out.println("This is c1 "+c1);
		
		methods obj1 = new methods();
		c= obj1.logic(a,b);
		c1 = obj1.logic(a1, b1);

	}

}
