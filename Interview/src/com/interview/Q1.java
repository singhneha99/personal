package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {

	public static void main(String[] args) 
	{
		int[] arr1 = {2,6,4,9,0};
		
		//List<Integer> l1 = new ArrayList<>();
		
		for(int i = 0 ; i <= arr1.length/2; i++)
		{
			
				int temp = 0;
				temp = arr1[i];
				arr1[i] = arr1[arr1.length-i-1];
				arr1[arr1.length-i-1] = temp;
				
				
			
			
		}
		
		System.out.println(Arrays.toString(arr1));
	}

}
