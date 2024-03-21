package application;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Integer> list = Arrays.asList(3,4,5,6,7,5,34,2);
		
		Stream<Integer> std1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(std1.toArray()));
		
		int sum = list.stream().reduce(0, (acc, item) -> acc + item); 
		System.out.println(Arrays.toString(new int[] {sum}));
		
		List<Integer> newList = list.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10)
				.collect(Collectors.toList());
		System.out.println(Arrays.toString(newList.toArray()));

	}

}
