package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,3,5,4,6,7,8,7);
		
		Stream<Integer> st1 = list.stream()
				.map(x -> x * 10)
				.filter(x -> x < 40);
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, x -> new Long[] {x[1], x[0] +x[1]})
				.map(x -> x[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
		

	}

}
