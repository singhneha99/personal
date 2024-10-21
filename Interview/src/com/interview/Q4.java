package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class Q4 extends Thread{

	static ConcurrentHashMap<Integer, String> hm = new ConcurrentHashMap<>();
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) 
	{
//		int [] arr = {2,7,5,4,9,7};
//		
//		List<Integer> li = new ArrayList<>();
//		for(Integer i: arr)
//		{
//			li.add(i);
//		}
//
//		Optional<Integer> secMax = li.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
//		System.out.println(secMax.get());
		
		List<Object> l1 = List.of(1,Arrays.asList(2,3),4);
		for(Object o: l1)
		{
			boolean isList = false;
			if(o.getClass().getName().equals(ArrayList.class.getName()))
			{
				isList = true;
				
			}
			System.out.println(isList);
		}

		
		
	}
}
