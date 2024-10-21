package pepCoding;

import java.util.Arrays;

public class DifferenceOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,1,1,1,1,1};
		int[] arr2 =   {2,3,4,6,9};
		
		int[] arr3 = new int[arr1.length > arr2.length ? arr1.length : arr2.length];
		
		boolean carry = false;
		
		for(int i = arr1.length-1, j = arr2.length-1; i >=0; i--,j--)
		{
			if(carry == true)
			{
				arr1[i] = arr1[i] - 1;
			}
			int difference = 0;
			if(j >= 0)
			{
				if(arr1[i] >= arr2[j])
				{
					difference = arr1[i] - arr2[j];
					arr3[i] = difference;
					carry = false;
				}
				else
				{
					arr1[i] = 10 + arr1[i];
					difference = arr1[i] - arr2[j];
					arr3[i] = difference;
					carry = true;
				}
			}
			else 
			{
				arr3[i] = arr1[i];
			}
		}
		
		System.out.println(Arrays.toString(arr3));

	}

}
