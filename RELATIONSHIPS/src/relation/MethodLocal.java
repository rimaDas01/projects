package relation;


public class MethodLocal {
	
	private int n=100;
	void testInner(){
			class Inner{
				void show(){
					System.out.println(n);
				}
			}
			

			new Inner().show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MethodLocal().testInner();

	}

}
