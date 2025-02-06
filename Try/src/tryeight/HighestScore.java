package tryeight;

public class HighestScore {
	public static void main (String [] args)
	{
		int a = 98;
		int b = 96;
		int c = 92;
		if (a>b &&  a>c)
			System.out.println ("Score of Raman is "+a);
		else if (b>a && b>c)
			System.out.println ("Score of Farhaan is "+b);
		else
			System.out.println ("Score of Geeta is "+c);
	}
}
