package codility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Dominator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayOfElements = {3,4,3,2,3,-1,3,3};
		solution(arrayOfElements);
	}
	
	public static int solution(int[] A)
	{
		Map<Integer, Long> mapOfCount = new HashMap<>();
		List<Integer> listOfIntegers = new ArrayList<>();
		int result = 0;
		long v = A.length/2;
		for(int i: A)
		{
			listOfIntegers.add(i);
		}
		mapOfCount = listOfIntegers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		for(Long i: mapOfCount.values())
		{
			if(i>v)
			{
				v = i.longValue();
			}
			else
			{
				result = -1;
			}
			for(int j = 0; j<A.length-1; j++)
			{
				if(A[j]==v)
				{
					result = j;
				}
			}
		}
		return result;
		
	}

}
