package features;

public class MethodWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr= {100,200,300,400,500};
		print(arr);
	}
	static void print(int[]a) {
		for(int element: a) {
			System.out.println(element);
		}
	}

}
