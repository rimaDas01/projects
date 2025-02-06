package features;

public class MethodAssignmnet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = num({10,36,99,200,1});
//		int greatest = arr[0];
//		System.out.println(greatest);

	}
	static int num(int[]a) {
		int greatest = a[0];
		for(int i=0;i<=a.length;i++) {
			if(a[i]>greatest)
				greatest = a[i];
		}
		System.out.println(greatest);
	}

}
