package com.interview;

import java.util.ArrayList;
import java.util.List;

//IBM
public class Q11 {

	public static void main(String[] args) 
	{
		List<Integer> l = new ArrayList<>();
				//List.of(0,1,3,2,4);
		l.add(0);
		l.add(1);
		l.add(3);
		l.add(2);
		l.add(4);
		
		Integer sum = 5;
		
		int i = 0;
		int j = l.size()-1;
		
			while(i < j)
			{
				List <Integer> pairs = new ArrayList<>();
				
				if(l.get(i) + l.get(j) == sum)
				{
					pairs.add(i);
					pairs.add(j);
					System.out.println(pairs.toString());	
				}
				else if(l.get(i) + l.get(j) < sum)
				{
					i++;
				}
				else
					j--;
								
			}
			
		
//		String s = "Java InterviewJ";
//		s = s.replace(" ", "");
//		char[] ch = s.toCharArray();
//		
//		
//		for(char c: ch)
//		{
//			int count = 0;
//			for(int i = 0; i <= s.length()-1; i++)
//			{
//				
//				if(c == s.charAt(i))
//				{
//					count++;
//				}
//			}
//			if(count == 1)
//			{
//				System.out.println(c);
//				break;
//			}
//		}

	}

}
