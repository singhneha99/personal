package pepCoding;

import java.util.Arrays;

public class SubarrayOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a1 = {'a','b','c','d'};
		
		for(int i = 0; i <= a1.length-1; i++)
		{
			for(int j = i; j <= a1.length-1; j++)
			{
				for(int k = i; k <= j; k++)
				{
					System.out.println(a1[k] + "\t");
				}
				System.out.println();
			}
		}

	}

}
