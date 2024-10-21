package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,3,4,5,6,9};
        int[] arr2 = {1,2,3,4,5,6,9};
        int[] arr3 = new int[arr1.length > arr2.length ? arr1.length : arr2.length];
        
        List<Integer> l1 = new ArrayList<>();
        
        //Set<Integer> s1 = new HashSet<>();
        
        for(int i: arr1)
        {
             l1.add(i);
        }
        
        for(int i: arr2)
        {
        	l1.add(i);
        }
        
        List<Integer> distinct = l1.stream().distinct().collect(Collectors.toList());
        
        for(int i = 0; i <= arr3.length-1; i++)
        {
        	arr3[i] = distinct.get(i);
        }
        System.out.println(Arrays.toString(arr3));
    

	}

}
