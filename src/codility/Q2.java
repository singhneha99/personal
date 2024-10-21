package codility;


import java.util.Stack;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =//"BBABAA";
				"BAAABAB";
		solution(s);

	}

	public static int solution(String S) 
	{
		int count = 0;
//		Stack<Character> s = new Stack<>();
//		s.push(S.charAt(0));
//		for(int i = 1; i<S.length()-2; i++)
//		{
//			if(S.charAt(i)!= S.charAt(i+1) && S.charAt(i)==S.charAt(i+2))
//			{
//				s.pop();
//			}
//			if(!s.isEmpty() && s.peek() != S.charAt(i))
//			{
//				s.pop();
//				count++;
//			}
//			s.push(S.charAt(i));
//		}
		StringBuilder sb = new StringBuilder(S);
		for(int i = 0; i<=sb.length()-1; i++)
		{
			if(sb.charAt(i)!=sb.charAt(i+1))
			{
				sb.deleteCharAt(i);
				System.out.println(sb);
				count++;
			}
		}
		
		
		System.out.println(count);
		return count;
		
	}
}
