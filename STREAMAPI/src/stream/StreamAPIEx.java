package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //Creating a stream of a fixed number of elements
//        Stream<Integer> stream = Stream.of(10,20,30,40,50); //of() is static method so it is used by calling classname(Stream) first then dot
        //terminal operation
//        stream.forEach(p -> System.out.println(p));
	
		List<Integer>list=Arrays.asList(10,20,30,50,60);
		Stream<Integer>stream = list.stream();
		stream.forEach(System.out::println);
	}

}
