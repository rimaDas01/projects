package alice_bob_points;

import java.util.Arrays;
import java.util.List;

public class AliceBobPoints {
	
	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        
        int alicePoints=0, bobPoints=0;
        
         
        for(int i=0; i<a.size() && i<b.size(); i++){
        	 if (a.get(i) > b.get(i)) {
                 alicePoints++;
                 
             } else if (b.get(i) > a.get(i)) {
                 bobPoints++;
             }
         }
        List<Integer> arr= Arrays.asList(alicePoints,bobPoints);
        return arr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> alice = Arrays.asList(99,28,20);
		List<Integer> bob = Arrays.asList(17,16,30);
		System.out.println("Points that alice and bob got are stored in a List-> "+compareTriplets(alice, bob));
	}

}
