package features;
class A{
	static void m1() {
		B.m3();
		B obj = new B();
		obj.m4();
	}
	void m2() {
		B.m3();
		B obj = new B();
		obj.m4();
	}
}
class B{
	static void m3(){
	}
	void m4() {
		
	}
}

public class StaticMemberProgram {
	static int x =1;
	
	StaticMemberProgram(){
		x=0;
	}
	
	static {
		x=100;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println(x);
		
		
		}
	static {
		x+=100;
	}

}
