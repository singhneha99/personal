package com.interview;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l1 = List.of(5,9,4,3,0,7,1,8);
		
		List<Integer> sortedList = l1.stream().sorted().limit(3).collect(Collectors.toList());
		sortedList.forEach(a -> System.out.println(a));
		
		
		List<Integer> reverseSortedList = l1.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
		reverseSortedList.forEach(a -> System.out.println(a));
		
//		
	}

}
