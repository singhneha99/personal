package package1;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] originalArray = getIntegers(5);
		printArray(originalArray);
		int [] sortedArray = sortIntegers(originalArray);
		System.out.println("-".repeat(21));
		printArray(sortedArray);
		
	}
	
	public static int[] getIntegers(int size)
    {
        try (Scanner scanner = new Scanner(System.in)) {
			int[] originalArray = new int[size];
			for(int i=0; i<size; i++)
			{
				System.out.print("Enter a number: ");
			    originalArray[i] = scanner.nextInt();
			}
			return originalArray;
		}
    }
    
    public static void printArray(int[] array)
    {
//        String str = Arrays.toString(array);
        for(int i = 0; i< array.length; i++)
        {
            System.out.println("Element "+ i + " contents "+ array[i]);
        }
        
    }
    
    public static int[] sortIntegers(int[] unsortedArray)
    {
        Arrays.sort(unsortedArray);
        int[] unsortedArray1 = Arrays.copyOf(unsortedArray, unsortedArray.length);
        for(int i =0; i<unsortedArray.length; i++)
        {
            unsortedArray1[i] = unsortedArray[(unsortedArray1.length - 1) - i];
        }
        return unsortedArray1;
    }

}
