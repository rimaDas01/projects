package test;

public class Electronic implements Device{
	public void dolt() {}
}
abstract class Phone1 extends Electronic{}
abstract class Phone2 extends Electronic{
	public void dolt(int x) {}
}
abstract class Phone3 extends Electronic{
	public void doStuff() {}
}
interface Device {
	public void dolt();
}

