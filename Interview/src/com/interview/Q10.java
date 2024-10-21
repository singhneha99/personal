package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q10 {

	public static void main(String[] args) throws Exception 
	{
		int[] a1 = {2, 3, 1, 0, 5, 2, 1};
		
		List<Integer> l1 = new ArrayList<>();
		for(Integer i: a1)
		{
			l1.add(i);
		}
		
		int product = 1;
		
		Integer i = l1.stream().distinct().filter(a -> a != 0).reduce(product,(a,b) -> a*b);
		
		//Integer i = l1.stream().reduce(product,(a,b) -> a*b);
		System.out.println(i);



	}

}
