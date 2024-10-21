package com.coreJava;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RoughWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		final int b = 5;
//		b = 6;
		//System.out.println(b);
//		BigInteger bi = BigInteger.valueOf(10);
//		System.out.println(bi.multiply(BigInteger.valueOf(2)));
		
		List<String> li = new ArrayList<>();
		String [] arr1 = new String[10];
				//List.of("Neha", "Raksha","Ved","Neha", "Ved","Ashish");
//		
//		li = li.stream().distinct().collect(Collectors.toList());
//		
//		System.out.println(li.toString());
		
		//printNumbers(1);
		
		//Print numbers from 1 to 10 with stream API.
		//IntStream.rangeClosed(1, 10).forEach(System.out::println);
		
		
		//Filter odd and even numbers
		/*
		List<Integer> l1 = List.of(3,9,54,3,12);
		Map<Object, List<Integer>> numbers = l1.stream().collect(Collectors.groupingBy(a -> a%2 == 0));
		

		for(List<Integer> a: numbers.values())
		{
			System.out.println(a);
		}
		*/
		
		Optional<String> a = Optional.ofNullable(arr1[5]);
		//if(a.isPresent())
		if(arr1[5] != null)
			System.out.println(arr1[5].toLowerCase());
//		else
//			System.out.println("No element found");
		
	}
	
	public static void printNumbers(int n)
	{
		if(n>10)
		{
			return;
		}
		
		System.out.println(n);
		printNumbers(n+1);
	}
	
	

}
