package package1;

import java.util.Arrays;
import java.util.Random;

//import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] sArray = {"Neha","Raksha","Ashish","Atul"};
//		Arrays.sort(sArray);
//		System.out.println("Sorted Array: "+ Arrays.asList(sArray));
//		if(Arrays.binarySearch(sArray, "Varun") >= 0)
//		{
//			System.out.println("Neha is present in the array");
//		}
//		else
//		{
//			System.out.println("Element not present in the array");
//		}
		arraysChallenge();
		
	}
	
	public static void arraysChallenge()
	{
	
		Random random = new Random();
		Integer[] array1 = new Integer[10];
		for(int i=0; i<10; i++)
		{
			array1[i] = random.nextInt(100);
		}
		Integer [] array2 = Arrays.copyOf(array1, 12);
		System.out.println("Original Array: "+Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.println("Sorted array: "+Arrays.toString(array1));
		for(int i = 9; i>=0; i--)
		{
			array2[i] = array1[9-i];
		}
		System.out.println("Sorted array in descending order: "+ Arrays.toString(array2));
	}

}
