package gen;

import java.util.HashMap;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String>stateCapitalMap = new HashMap<>();
		stateCapitalMap.put("West Bengal", "Kolkata");
		stateCapitalMap.put("Goa", "Panaji");
		stateCapitalMap.put("Bihar","Patna");
		stateCapitalMap.put("Maharashtra", "Mumbai");
		stateCapitalMap.put("Punjab", "Chandigarh");
		
		String capital = stateCapitalMap.get("West Bengal");
		String capital1 = stateCapitalMap.get("Punjab");
		System.out.println(capital);
		System.out.println(capital1);
		
//		System.out.println("Values are: "+stateCapitalMap.values());
	}

}
