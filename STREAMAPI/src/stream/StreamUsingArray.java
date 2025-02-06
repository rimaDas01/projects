package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
        for(int i=10; i<100; i+=10)
              list.add(i);
        Stream<Integer> stream = list.stream();
//        stream.forEach(p -> System.out.println(p));
        stream.forEach(System.out::println); //using scope resolution

	}

}
