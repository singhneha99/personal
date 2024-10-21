package pepCoding;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a1 = {10,20,30,40,40,50};
		int i = 0;
		int j = a1.length-1;
		
		while(i < a1.length/2 && j >= 0)
		{
			int temp;
			temp = a1[i];
			a1[i++] = a1[j];
			a1[j--] = temp; 
		}

		System.out.println(Arrays.toString(a1));
	}

}
