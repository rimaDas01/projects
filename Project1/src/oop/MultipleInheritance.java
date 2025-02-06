package oop;

interface IComputable{
	void compute();
}
interface IPortable{
	void port();
}
abstract class Machine{
	abstract void operate(); 
}
class Computer implements IComputable,IPortable{
	public void compute(){
		
	}
	public void port() {
		
	}
	public void operate() {
		
	}
}



public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
