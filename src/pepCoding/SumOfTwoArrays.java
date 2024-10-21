package pepCoding;

import java.util.Arrays;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 =   {3,1,0,7,5};
		int[] arr2 = {1,2,1,1,1,9};
		
		int [] arr3 = new int[arr2.length];
		int rem = 0;
		for(int i = arr1.length-1, j = arr2.length-1; i >= 0; i--, j--)
		{
			int sum = 0;
			if(j >= i)
			{
				sum = arr1[i] + arr2[j] + rem;	
				arr3[j] = sum % 10;
			}
			rem = sum/10;
			arr3[i] = arr2[i] + rem;

		}
		
		System.out.println(Arrays.toString(arr3));

	}

}
