package features;

public class QuadEqn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
        float b = 3.2f;
        int c = 5;
        double x1;
        double x2;
        double d = b*b - 4*a*c;
        
        if(d>0){
        x1 = (-b + Math.sqrt(b*b - 4*a*c))/2*a;
        x2 = (-b - Math.sqrt(b*b - 4*a*c))/2*a;
        System.out.println("Roots are real and distinct: ");
        System.out.println(Math.abs(x1));
        System.out.println(Math.abs(x2));
        }
        else if (d == 0){
        
            x1 = x2 = -b/(2*a);
            System.out.println("The values of x1 and x2 are equal"+x1);
        }
        else{
            double real = -b/(2*a);
            double img = Math.sqrt(-d)/(2*a);
            System.out.println("The roots are complex and distinct: ");
            System.out.format("x1 = %.2f + %.2fi",real,img);
            System.out.format("\nx2 = %.2f - %.2fi",real,img);
        }
	}
}
