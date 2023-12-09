package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("joao");
		list.add("carlos");
		list.add("jose");
		list.add("antonio");
		list.add(2, "sonia");
		
		System.out.println(list.size());
		for(String name: list) {
			System.out.println(name);
		}

		//list.remove(4);
		System.out.println("--------------------------------------------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		for(String name: list) {
			System.out.println(name);
		}
		System.out.println("--------------------------------------------------");
		System.out.println(list.indexOf("sonia"));
		System.out.println(list.indexOf("pedro"));
		for(String name: list) {
			System.out.println(name);
		}
		System.out.println("--------------------------------------------------");
		//list.removeIf(x -> x.charAt(0) != 'c');
		for(String name: list) {
			System.out.println(name);
		}
		System.out.println("--------------------------------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) != 's').collect(Collectors.toList());
		for(String name: result) {
			System.out.println(name);
		}
		System.out.println("--------------------------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);
		System.out.println(name);
	}

}
