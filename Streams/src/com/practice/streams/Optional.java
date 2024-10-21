package com.practice.streams;

import java.util.List;

public class Optional {

	public static void main(String[] args) 
	{
		java.util.Optional<Integer> o =
		List.of(23,7,45, 12).stream().filter(i -> i%2 ==0).max((a,b) -> Integer.compare(a, b));
		
		o.ifPresentOrElse(v -> System.out.println(v), ()->System.out.println(0));
		if(o.isPresent())
		{
			System.out.println(o.get().toString().charAt(0));
		}
		
//		System.out.println(o.get());
//		System.out.println(o.isEmpty());
	}

}
