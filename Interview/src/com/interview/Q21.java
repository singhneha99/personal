package com.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

//Accolite L1 - 27/09/24
public class Q21 {

	public static void main(String[] args) 
	{
		String s = "AABBCCDDdd/";
		
		s = s.toLowerCase();
		
		
		char [] ch = s.toCharArray();
		
		List<Character> l1 = new ArrayList<>();
		
		for(int i = 0; i <= ch.length-1; i++)
		{
			l1.add(ch[i]);
		}
		
		
		Map<Character, Long> map = l1.stream().filter(a -> !Character.isJavaLetterOrDigit(a)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		for(Entry<Character, Long> e: map.entrySet())
		{
			System.out.println(e.getKey() + " " + e.getValue());
		}

	}

}
