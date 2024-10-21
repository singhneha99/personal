package pepCoding;

import java.util.Arrays;

public class RotateAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] a1 = {'a','b','c','d','e'};
		int n = 6;
		n = n % a1.length;
		if(n < 0)
		{
			n = n + a1.length;
		}		
		int i = 0;
		int j = a1.length-1 - n;
		int k = a1.length-1;
		
		reverse(a1, i, j);
		
		reverse(a1, j+1, k);
		
		reverse(a1, 0, k);
		
		System.out.println(Arrays.toString(a1));
	}
	
	public static void reverse(char[] a1, int i, int j)
	{
		while(i < j)
		{
			char temp = a1[j];
			a1[j] = a1[i];
			a1[i] = temp;
			i++;
			j--;
		}
	}

}
