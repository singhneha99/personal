package codility;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayOfElements = {9,1,2,2,5,6};
		solution(arrayOfElements);	
	}

	public static int solution(int[] A) 
	{
		int latestProduct = 1;
		List<Integer> productList = new ArrayList<>();
		for(int i = 0; i<=A.length-1; i++)
		{
			for(int j = i+1; j< A.length-1; j++)
			{
				latestProduct = A[i]*A[j]*A[j+1];
				productList.add(latestProduct);
			}
			
		}
		Integer max = productList.stream().max(Comparator.naturalOrder()).get();
		System.out.println(max);
		
		
		
		return max;
    }
}
