package features;

public class CommandLineArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String name;
//		name= args[0];
//		System.out.println("Hello "+name);
		
		int a,b;
		a = Integer.parseInt(args[0]);
		b= Integer.parseInt(args[1]);
		System.out.println("Result: "+(a+b));

	}

}
