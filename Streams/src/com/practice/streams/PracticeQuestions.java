package com.practice.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Q1. Write a Java program to calculate the average of a list of integers using streams.
		List<Integer> listOfIntegers = new ArrayList<>(List.of(2, 7, 1, 13, 56, 8, 19, 23, 4, 8));
		Double average = listOfIntegers.stream()
										.mapToDouble(Integer::doubleValue)
										.average()
										.orElse(0.0);
		System.out.println(average);
		System.out.println("-------------------------");
		
		
		//Q2. Write a Java program to convert a list of strings to uppercase or lowercase using streams.
		List<String> listOfString = new ArrayList<>(List.of("Neha","Ashish","Ved","Raksha","Atul","Varun","Richa"));
		listOfString.stream()
					.map(a -> a.toUpperCase())
					.forEach(System.out::println);
		
		listOfString.stream()
		.map(a -> a.toLowerCase())
		.forEach(System.out::println);
		System.out.println("-------------------------");
		
		
		//Q3. Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
		List<Integer> listOfIntegers3 = new ArrayList<>(List.of(2, 7, 1, 13, 56, 8, 19, 23, 4, 8));
		Integer sumOfEvens = listOfIntegers3.stream()
						.filter(a -> a%2 == 0)
						.mapToInt(Integer::intValue)
						.sum();
		System.out.println(sumOfEvens);
		Integer sumOfOdds = listOfIntegers3.stream()
				.filter(a -> a%2 != 0)
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println(sumOfOdds);
		System.out.println("-------------------------");
		
		
		//Q4. Write a Java program to remove all duplicate elements from a list using streams.
		List<String> listOfDuplicateStrings = new ArrayList<>(List.of("Neha","Ashish","atul","Raksha","Atul","Varun","Neha"));
		List<String> withoutDuplicates = listOfDuplicateStrings.stream()
																.distinct()
																.collect(Collectors.toList());
		for(String s: withoutDuplicates)
			System.out.println(s);
		System.out.println("-------------------------");
			
		
		//Q5. Write a Java program to count the number of strings in a list that start with a specific letter using streams.
		List<String> listOfStrings5 = new ArrayList<>(List.of("Neha","Ashish","Atul","Raksha","Atul","Varun","Neha"));
		System.out.println(listOfStrings5.stream()
						.filter(a -> a.startsWith("A"))
						.count());
		System.out.println("-------------------------");
		
		
		
		//Q6. Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
		List<Integer> listOfIntegers6 = new ArrayList<>(List.of(2, 7, 1, 13, 56, 8, 19, 23, 4, 8));	
		List<Integer> listOfIntegers6sorted = listOfIntegers6.stream().sorted().collect(Collectors.toList());
		for(Integer s: listOfIntegers6sorted)
			System.out.println(s);
		System.out.println("-------------------------");
		
		
		
		//Q7. Write a Java program to find the maximum and minimum values in a list of integers using streams.
		List<Integer> listOfIntegers7 = new ArrayList<>(List.of(2, 7, 1, 13, 56, 8, 19, 23, 4, 8));	
		Integer minValue = listOfIntegers7.stream().mapToInt(Integer::intValue)
						.min().orElse(0);
		
		minValue = listOfIntegers7.stream().mapToInt(Integer::intValue)
				.min().orElse(0);
		Integer maxValue = listOfIntegers7.stream().mapToInt(Integer::intValue)
						.max().orElse(0);
		System.out.println("Minimum value: "+minValue+" Maximum value: "+maxValue);
		System.out.println("-------------------------");
		
		
		//Q8. Write a Java program to find the second smallest and largest elements in a list of integers using streams.
		List<Integer> listOfIntegers8 = new ArrayList<>(List.of(2, 7, 1, 13, 56, 8, 19, 23, 4, 8));	
		Integer secondMinValue = listOfIntegers8.stream()
													.sorted()
													.skip(1)
													.findFirst()
													.orElse(0);
		Integer secondMaxValue = listOfIntegers8.stream()
				.sorted((a,b) -> b.compareTo(a))
				.skip(1)
				.findFirst()
				.orElse(0);
													
		System.out.println("Minimum value: "+secondMinValue+" Maximum value: "+secondMaxValue);
		System.out.println("-------------------------");
		
		
		//Q9. How do you find frequency of each character in a string using Java 8 streams?
		String inputString = "Java Concept Of The Day";
		Map<Character, Long> charCountMap = inputString.chars()
														.mapToObj(c -> (char)c)
														.collect(Collectors.groupingBy(Function.identity(),  Collectors.counting()));
		System.out.println(charCountMap);
		System.out.println("-------------------------");

		
		//Q10. How do you find frequency of each element in an array or a list?
		List<Integer> listOfIntegers10 = new ArrayList<>(List.of(2, 7, 1, 1, 56, 8, 19, 2, 4, 8));	
		Map<Integer, Long> integerCount = listOfIntegers10.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(integerCount);
	}

}
