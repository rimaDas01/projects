package exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
			FileReader fr = new FileReader("file.txt");
		BufferedReader bfr = new BufferedReader(fr);
		int arr[]= {1,2,3,4,5};
		int sum=0,i;
		List myArray(int a[]) {
			a[i]=arr[i];
			Iterator it= myArray.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		for(i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		if(sum==(sum+a[i])+2)
			System.out.println(a[i+1]-1);
		else
			System.out.println( new Main().myArray());
	}

}
