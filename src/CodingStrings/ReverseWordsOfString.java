package CodingStrings;

import java.util.Arrays;

public class ReverseWordsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words = "I like this program very much";
		StringBuilder sb = new StringBuilder();
		
		
		String[] a1 = words.split(" ");
		for(int i = a1.length-1; i >=0; i--)
		{
			sb.append(a1[i]+" ");
		}

		System.out.println(sb.toString());
	}

}
