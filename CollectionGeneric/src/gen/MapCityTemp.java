package gen;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapCityTemp {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Map<String,Double> cityTemp = new HashMap<>();  //preserves order as given by user 
//		Map<String,Double> cityTemp = new TreeMap<>(); //alphabetic sorting
		Map<String,Double> cityTemp = new LinkedHashMap<>();

		
		cityTemp.put("Kolkata", 33.0);
		cityTemp.put("Punjab", 37.9);
		cityTemp.put("Mumbai", 27.12);
		cityTemp.put("Kolkata", 31.8); //new value
		cityTemp.put("Bihar", 38.0);
		
		/*Double temp1 = cityTemp.get("Kolkata");
		Double temp2 = cityTemp.get("Punjab");
		Double temp3 = cityTemp.get("Mumbai");
//		Double temp4 = cityTemp.get("Gurgaon");
		
		System.out.println(temp1);
		System.out.println(temp2);
		System.out.println(temp3);
		System.out.println(temp4);*/
		
		
		//key set
		/*Set<String> keys= cityTemp.keySet();
		Iterator<String>it=keys.iterator();
		
		while(it.hasNext()) {
			String keyNameIsCityName=it.next();
			System.out.println("Temparature of "+keyNameIsCityName+" is "+cityTemp.get(keyNameIsCityName)+" deg. celcius");
		}
		*/
		
		//entry set
		
		
		/*Set<Entry<String,Double>> entries = cityTemp.entrySet();
		Iterator<Entry<String,Double>>it= entries.iterator();
		
		while (it.hasNext()){
			Entry<String,Double> en = it.next();
			System.out.println(en.getKey()+" - "+en.getValue());
		}*/
	}

}
