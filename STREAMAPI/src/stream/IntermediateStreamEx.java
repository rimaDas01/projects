package stream;

import java.util.stream.Stream;

public class IntermediateStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//intermediate and terminal (aggregate) operations on stream
        Stream<String> stream = Stream.of("Robert","Tom","Jerry","Donald","Lily","Anand","Akash");      
        stream.filter((s) -> s.startsWith("A"))
                  .map(String::toUpperCase)
                  .forEach(System.out::println);

	}

}
