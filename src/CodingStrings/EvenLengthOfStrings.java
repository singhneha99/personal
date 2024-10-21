package CodingStrings;

public class EvenLengthOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "i am Geeks for Geeks and a Geek";
		String[] stringArray = s.split(" ");
		
		for(String c: stringArray )
		{
			if(c.length() % 2 == 0)
			{
				System.out.println(c);
			}
		}
	}

}
