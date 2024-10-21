package java8;


import java.util.Arrays;

public class LambdaChallenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String source = "My name is Neha";
		Arrays.asList(source).forEach(s -> 
		{
			String str = everySecondCharacter(s);
			System.out.println(str);
		});
		
	}

	
	public static String everySecondCharacter(String source)
	{
		StringBuilder returnValue = new StringBuilder();
		for(int i=0; i< source.length(); i++)
		{
			if(i%2 == 1)
			{
				returnValue.append(source.charAt(i));
			}
		}
		return returnValue.toString();
	}
}
