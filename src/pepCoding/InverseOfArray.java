package pepCoding;

import java.util.Arrays;

public class InverseOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {3,4,1,2,0};
		          //0,1,2,3,4
		         //{4,2,3,0,1}
		int[] inverse = new int[a1.length];
		
		for(int i = 0; i <= a1.length-1; i++)
		{			
			inverse[a1[i]] = i;
		}
		
		System.out.println(Arrays.toString(inverse));
	}

}
