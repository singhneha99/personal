package com.practice.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamsIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] numbers = {"One","Two","Three"};
		Arrays.stream(numbers)
				.sorted(Comparator.reverseOrder())
				.forEach(System.out::println);
		
		Stream.of("Five","Six","Seven","seven")
				.map(String::toUpperCase)
				.map(s -> s.charAt(0) + " - " + s)
				.distinct()
				.forEach(System.out::println);
		
		
		Random random = new Random();
		Stream.generate(()-> random.nextInt(3))
				.limit(10)
				.forEach(s-> System.out.print(s+" "));
		
		
		List<String> listOfSubjects = new ArrayList<>(List.of(
			"Java","Python","Ruby","C#","Java","Python"
		));
		
		listOfSubjects.stream().map(String :: toLowerCase).distinct().forEach(a->System.out.println(a));
	}

}
