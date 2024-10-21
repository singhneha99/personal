package codility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;




/*Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
Copyright 2009–2024 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.*/

public class MinimumInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 3, 6, 4, 1, 2};
		solution(arr);
	}
	
	public static int solution(int[] A) {
        // Implement your solution here
		int[] unsortedArray = A;
		Arrays.sort(A);
		int largest = A[A.length-1];
		int n = 1;
		int minimumInteger = 0;
		for(int neg = 0; neg <= A.length-1; neg++)
		{
			if(A[neg] < 0)
			{
				minimumInteger = 1;
			}
		}

		while(n < largest)
		{
			for(int i = 0; i <= unsortedArray.length-1; i++)
			{
				if(A[i] == n)
				{
					n++;
					continue;
				}
			}
			minimumInteger = n;
			break;
			//n++;
		}
		System.out.println(minimumInteger);
        return minimumInteger;
    }

}
