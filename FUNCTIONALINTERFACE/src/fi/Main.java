package fi;

@FunctionalInterface
interface ISingleParamOperation{
	String singeParamOperation (String name);	
}
@FunctionalInterface
interface IMultiParamOperation{
	void multiParamOperation (String name, Long contactNo);
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ISingleParamOperation spo = name->"Hello "+name;
		IMultiParamOperation mpo= (name,contactNo)->{
			System.out.println("Hello "+name);
			System.out.println("Contact: "+contactNo);
		};
		System.out.println(spo.singeParamOperation("Rima"));
		mpo.multiParamOperation("Richard",8990087559L);

	}

}
