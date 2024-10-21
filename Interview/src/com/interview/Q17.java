package com.interview;

import java.util.Arrays;

//UST L1
public class Q17 {

	public static void main(String[] args) 
	{
		String s1 = "Neha Singh";
		String s2 = "Singh Neha";
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
	
		
		int i = 0;
		boolean result = false;
		int count = 0;
		
		if(ch1.length == ch2.length)
		{
			while(i < ch1.length)
			{
				if(ch1[i]==ch2[i])
				{
					result = true;
					count++;
				}
				i++;
			}
		}
		
		if(result == true && count == ch1.length)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
		
		

	}

}
