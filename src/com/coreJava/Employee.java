package com.coreJava;

import java.util.Arrays;

public class Employee 
{

	private int[] arr;
	
	
	public Employee(int[] data) {
		//this.arr = arr; -- shallow copy
		arr = new int[data.length];
		for(int i = 0; i < data.length; i++)
		{
			arr[i] = data[i];
		}
	}


	public void showData()
	{
		System.out.println(Arrays.toString(arr));
	}
}
