package com.practice.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamPractice02 {

	public static void main(String[] args) 
	{
		//Q1. Given a stream containing some elements, the task is to get the first element of the Stream in Java.
		
		String[] arr1 = {"Geek_First","Geek_2","Geek_3","Geek_4","Geek_Last"};
		//Output: Geek_First

		Integer[] arr2 = {1, 2, 3, 4, 5, 6, 7};
		//Output: 1
		
		List<String> l1 = Arrays.asList(arr1);
		List<Integer> l2 = Arrays.asList(arr2);
		
		String first = l1.stream().findFirst().get();
		System.out.println(first);
		
		Integer firstNumber= l2.stream().findFirst().get();
		System.out.println(firstNumber);

		
		
		System.out.println("--------------------------------");
		
		
		//Q2. Given a stream containing some elements, the task is to find the duplicate elements in this stream in Java.
		List<Integer> listOfDuplicates = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
		
		Map<Integer, Long> mapOfDuplicates = listOfDuplicates.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		//for getting duplicates.
		for(Map.Entry<Integer, Long> i: mapOfDuplicates.entrySet())
		{
			if(i.getValue() > 1)
			{
				System.out.println(i.getKey());
			}
		}
		
		//for getting elements with maximum occurrences.
		Long max = mapOfDuplicates.values().stream().max(Comparator.naturalOrder()).get();
		mapOfDuplicates.entrySet().stream().filter(a -> a.getValue() == max).forEach(a -> System.out.println("Elements with max occurrences: "+a));
		
		System.out.println("--------------------------------");
		
		
		//Q3. Given a string and a character, the task is to make a function which counts the occurrence of the given character in the string using Stream API.
		String str = "geeksforgeeks"; char c = 'e';
		Long count = str.chars().filter(a -> a == c).count();
		System.out.println(count);
		
		
		System.out.println("--------------------------------");
		
		//Q4. Program to convert List of String to List of Integer in Java.
		List<String> listOfString = Arrays.asList("1", "2", "3", "4", "5");
		//List<Integer> listOfInt = 
		listOfString.stream().map(a -> Integer.valueOf(a)).collect(Collectors.toList()).stream().forEach(a -> System.out.println(a));;
		//listOfInt.stream().forEach(a -> System.out.println(a));
		System.out.println("--------------------------------");
				
				
		//Q5. Sum of list with stream filter in Java
		List<Integer> listOfElementsToSum = Arrays.asList(1, 5, 6, 7, 8, 9, 10);
		Integer sum = listOfElementsToSum.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		
	}

}
