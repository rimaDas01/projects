package gen;

class Gen<T,V>{
	void show(T arg1,V arg2) {  //generic method  //T is an indication of datatype
		//here show method is accepting any general datatype this liberty is given 
		System.out.println(arg1+","+arg2);
	}
}

public class GenericEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gen<String,Double> g1=new Gen<String,Double> ();
		Gen<Boolean,Boolean> g2=new Gen<>();
		Gen<Double,String> g3= new Gen<>();
		Gen<Character,Float>g4= new Gen<>();
		
		g1.show("1234",55.90);
		g2.show(true,false);
		g3.show(123.45,"Rima");
		g4.show('#',123.45f);
	}

}
