package features;


class Calculator{
	void add() {
		System.out.println("Adding numbers");
	}
	void add(int a,int b) {
		System.out.println("Sum is: "+(a+b));
	}
	void add(int x,float y,int z) {
		System.out.println("Sum is: "+(x+y+z));
	}
	void add(String s1,char c,String s2) {
		System.out.println(s1+c+s2);
	}
	void add(char p,char r) {
		System.out.println(p+r);
	}
}

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		c.add();
		c.add(22,99.9f,1);
		c.add(9,0);
		c.add("Rima ",'&' ," Zenny");
		c.add('d','x');
	}

}
