package codility;


import java.util.Stack;

public class Brackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = //"{[()()]}*";
				//"([)()]()*";
				"";
		solution(s);
	}
	
	public static int solution(String S)
	{
		Stack<Character> s = new Stack<>();
		int result=0;
		
		if(S.length() == 0)
		{
			result = 0;
		}
		char[] chars = S.toCharArray();
		for(Character c: chars)
		{
			if(c != '(' || c != ')' || c != '{' || c != '}' || c != '[' || c != ']')
			{
				result = 0;
			}
			
		}
		
		for(Character ch: chars)
		{
				if(ch == '(')
				{
					s.push(ch);
				}
				else if( ch == ')')
				{
					if(!s.isEmpty() && s.peek()=='(')
						s.pop();
				}
				else if(ch == '{')
				{
					s.push(ch);
				}
				else if(ch == '}')
				{
					if(!s.isEmpty() && s.peek() == '{')
					{
						s.pop();
					}
				}
				else if(ch == ']')
				{
					if(!s.isEmpty() && s.peek() == '[')
					{
						s.pop();
					}
					
				}
				else if(ch == '[')
				{
					s.push(ch);
				}
				else
				{
					s.push(ch);
				}
			}
		if(s.isEmpty())
		{
			result = 1;			
		}
		else
			result = 0;
		System.out.println(result);
		return result;
		
	}

}
