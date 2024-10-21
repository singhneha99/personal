package com.interview;


//LTIMindtree L1
public class Q18 {

	public static void main(String[] args) 
	{
		String s1 = "Amma";
		
		s1 = s1.toLowerCase();
		
		StringBuilder sb = new StringBuilder();
		sb.append(s1);
		sb.reverse();
		
		if(s1.equals(sb.toString()))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

}
