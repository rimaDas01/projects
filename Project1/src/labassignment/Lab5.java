package labassignment;

class MathClass{
	void add(int a,double b) {
		System.out.println(a+b);
	}
	void add(String s,char c) {
		System.out.println(s+c);
	}
	void add(String d,float f,char x) {
		System.out.println(d+f+x);
	}
}

public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathClass m= new MathClass();
		m.add(34,1.990);
		m.add("Rima", 'D');
		m.add("Salary",22.75f, 'a');
	}

}
