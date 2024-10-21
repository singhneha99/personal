package com.interview;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

//MMT
public class Q16 {

	public static void main(String[] args) 
	{
		List<String> l1 = List.of("A","B","C","A","D","B");
		
		Map<String, Long> m = l1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		for(Entry<String, Long> e: m.entrySet())
		{
			System.out.println(e.getKey()+" : "+e.getValue());
		}

	}

}
