package package1;

import java.util.Arrays;

public class Practice_05_09_24 {

	public static void main(String[] args) 
	{
		/*
		String s1 = "Neha Singh";
		String rev = "";
		
		for(int i = s1.length()-1; i>=0; i--)
		{
			rev+=s1.charAt(i);
		}

		System.out.println(rev);
		*/
		
		String s1 = "Malayalam";
		String rev = "";
		
		for(int i = s1.length()-1; i>=0; i--)
		{
			rev+=s1.charAt(i);
		}
		
		if(s1.equalsIgnoreCase(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
		/*
		String s1 ="God";		
		String s2 = "Doggy";
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("Anagram");
		}		
		else
		{
			System.out.println("Not Anagram");
		}
		*/
	}

}
