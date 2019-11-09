package listExemplo;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class List {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		for(String x : list) {
			System.out.println(x);
		}

		System.out.println("---------------------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		for(String x : list) {
			System.out.println(x);
			
		}
		System.out.println("---------------------------");
		System.out.println("index of Bob: " + list.indexOf("Bob"));
		System.out.println("index of Marco: " + list.indexOf("Marco"));
		System.out.println("---------------------------");
		
		ArrayList<String> result =
				(ArrayList<String>) list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
