package codility;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {5,5,5,5,5,5};
				//{4,2,5,8,7,3,7};
		//{14,21,16,35,22};
		solution(A);
		
	
	}
	
	public static int solution(int[] A) 
	{
		int sum =0;
		int count = 0;
		List<Integer> l=new ArrayList<>();
		List<Integer> setFromList=new ArrayList<>();
		
		for(int a: A)
		{
			l.add(a);
		}
		
		setFromList=l.stream().distinct().collect(Collectors.toList());
		if(setFromList.size()==1)
		{
			count = A.length/2;
		}
		else
		{
			for(int i=0; i<l.size()-1; i++)
			{
				for(int j = i+1; j<l.size()-1; j++)
					{
					sum = l.get(i) + l.get(j);
					if(sum%2==0)
					{
						l.remove(i);
						l.remove(j);
						count++;
					}
				}
			}
			//return count;
		}
		
		
		
		
		System.out.println(count);
		return count;
	
	}

}
