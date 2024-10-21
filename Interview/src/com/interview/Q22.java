package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q22 {

	public static void main(String[] args) 
	{
		List<String> names = Arrays.asList("Neha","Ashish","Raksha","Ved");
		names = names.stream().reduce((a,b) -> a.length() > b.length() ? a : b).stream().collect(Collectors.toList());
		
		names.forEach(System.out::println);		
		
	}

}
