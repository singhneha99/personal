package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

//LTIMindtree L2 - 26/09/2024
public class Q19 {

	public static void main(String[] args) 
	{
//		String s = "LTIMindTree";
//		s = s.toLowerCase();
//		char[] ch = s.toCharArray();
//		
//		List<Character> li = new ArrayList<>();
//		for(int i = 0; i <= ch.length-1; i++)
//		{
//			li.add(ch[i]);
//		}
//		
//		LinkedList<Character> l2 = new LinkedList<>();
//		Character c = li.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//				                  .entrySet().stream().filter(a -> a.getValue() == 1).skip(1).findFirst().map(a -> a.getKey()).get();
//		
////		for(Entry<Character, Long> e: m.entrySet())
////		{
////			System.out.println(e.getKey() + " " + e.getValue());
////			if(e.getValue() == 1)
////			{
////				l2.add(e.getKey());
////			}
////			
////		}
//		
//		System.out.println(c);
		
		
//		
		Integer[] a1 = {15,10,20,25,12};
		List<Integer> l1 = new ArrayList<>(Arrays.asList(a1));
		
		l1 = l1.stream().sorted(Comparator.reverseOrder()).skip(1).collect(Collectors.toList());
		System.out.println(l1.get(0));
//		

	}

}
