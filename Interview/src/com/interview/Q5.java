package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Q5 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[] = {1, 8, 0, 0, 1, 10, 5};
				//sum = 15
				//Output: Sum found between indexes 5 and 6
		List<Integer> indices = new ArrayList<>();
		int sum = 0;
		int expectedSum = 15;
		
		for(int i = 0; i <= arr.length-1; i++)
		{
			for(int j = i+1; j <= arr.length-1; j++)
			{
				sum= arr[i] + arr[j];
				
				if(sum == expectedSum)
				{
					indices.add(i);
					indices.add(j);
				}
			}
		}		
		System.out.println(indices.toString());
		
	
	
	
	
	
	
	
	
		List<String> listOfStrings = new ArrayList<>();
		
		listOfStrings.add("india");
		listOfStrings.add("america");
		listOfStrings.add(null);
		listOfStrings.add("england");
		listOfStrings.add(null);
		
		
		for(int i = 0; i <= listOfStrings.size()-1; i++)
		{
			if(listOfStrings.get(i) == null)
			{
				listOfStrings.set(i, "NULL");
			}
			else
			{
				listOfStrings.set(i, listOfStrings.get(i).toUpperCase());
			}
		}
		
		System.out.println(listOfStrings.toString());
	}

}
