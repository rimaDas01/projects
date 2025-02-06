package practice;

import java.util.Arrays;
import java.util.List;

public class DiagonalDiff {
	
	public static int diagonalDifference(List<List<Integer>> arr) {
		int sum1=0, sum2=0;
		for(int i=0,j=0; i<arr.size() && j<arr.size(); i++,j++) {
			sum1=sum1+ arr.get(i).get(j);
		}
		for (int i=0,j=arr.size()-1; i<arr.size() && j>=0; i++,j--) {
			sum2=sum2+ arr.get(i).get(j);
		}
		return Math.abs(sum2-sum1);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> arr = Arrays.asList(
				Arrays.asList(11, 2 ,4),
				Arrays.asList(4, 5 ,6),
				Arrays.asList(10, 8 ,-12)
				);
		
		System.out.println("Helo");
		System.out.println(diagonalDifference(arr));
	}

}
