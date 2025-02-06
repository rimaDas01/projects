package oop;
interface Banks{
	double getROI();
}
class NoBank implements Banks{
	@Override
	public double getROI() {
	return 6.5;
	}
}
class YesBank implements Banks{
	@Override
	public double getROI() {
	return 7.25;
	}
}
public class InterfaceEx {

	public static void main(String[] args) {

		System.out.println(new NoBank().getROI());
		System.out.println(new YesBank().getROI());
	}

}
