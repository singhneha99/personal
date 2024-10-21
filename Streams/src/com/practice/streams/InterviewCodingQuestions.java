package com.practice.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewCodingQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> al = Arrays.asList(1,3,2,4,3,1,2);
		List<Integer> outputList = al.stream().distinct()
									.sorted(Comparator.reverseOrder())
									.collect(Collectors.toList());
		
		System.out.println(outputList.toString());
		

	}

}
