package relation;

interface Sample{
	void foo();
	double getNumber();
}

public class AnonymousClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample s = new Sample() {
			
			@Override
			public void foo() {
				// TODO Auto-generated method stub
				System.out.println("foo implemented using anonymous class");
			}
			
			public double getNumber() {
				return 1.2;
			}
		}; //terminated by ; becz entire body is encapsulated inside an anonymous(unknown) class
	
	s.foo();
	System.out.println(s.getNumber());
	}

}
