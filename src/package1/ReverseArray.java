package package1;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverse(new int[]{1,2,3,4,5});
	}
	
	 private static void reverse(int[] array1)
	    {
	        System.out.println("Array = "+ Arrays.toString(array1));
	        int temp = 0;
	        //int[] array2 = Arrays.copyOf(array1, array1.length);
	        for(int i =0; i< array1.length; i++)
	        {
	            
	            int elementToSwapIndex = array1.length - 1 - i;
	            if(i == elementToSwapIndex)
	            {
	            	break;
	            }
	            temp = array1[i];
	            array1[i] = array1[elementToSwapIndex];
	            array1[elementToSwapIndex] = temp;
	            
	        }
	        System.out.println("Reversed array = "+ Arrays.toString(array1));
	    }

}
