package test;

class Voop {

	public static void main(String[] args) {

		doStuff(1);
		doStuff(1,2);
	}
//	5.
//	static void doStuff(int x,int... doArgs) {
//		System.out.println("Hello Rima");
//	}
//	4.static void doStuff(int... doArgs, int y) {}--->varargs is always last so incorrect
//	3.static void doStuff(int doArgs...) {}--->wrong syntax
//	2.static void doStuff(int[] doArgs) {}--->both methods dont work
	
//	1
	static void doStuff(int... doArgs) {
		System.out.println("Hello");
	}
}
