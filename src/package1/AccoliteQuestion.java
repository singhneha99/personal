package package1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class AccoliteQuestion extends Thread {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s = "Great responsibility";
		
        //char[] ch = s.toCharArray();
		LinkedHashSet<Character> set1 = new LinkedHashSet<>();
        for(int i = 0; i<=s.length()-1; i++)
        {
            set1.add(s.charAt(i));
        }
        
        for(Character c: set1)
        {
        	System.out.print(c);
        }


	}

}
