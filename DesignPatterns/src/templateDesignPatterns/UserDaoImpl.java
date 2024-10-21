package templateDesignPatterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserDaoImpl {
	public static int solution(int N) 
    {
        // Implement your solution here
		String binaryNumber = binaryConversion(N);
		List<Integer> rounds = new ArrayList<>();
        
        int max = 0;
        int round = 0;
        int tempCount = 0;
        for(int i = 0; i < binaryNumber.length()-1; i=i+tempCount+1)
        {
        	
        	int count = 0;
        	if(binaryNumber.charAt(i)=='1')
            {
	        	for(int j = i+1; j< binaryNumber.length()-1; j++)
	        	{	
	        		if(binaryNumber.charAt(j) == '1')
	                {
	                	break;
	                }
	                if(binaryNumber.charAt(j) == '0')
	                {
	                    count++;
	                    if(binaryNumber.charAt(j+1)=='1')
	                	{
	                		round++;
	                	}
	                                     
	                }
	                continue; 
	                
	            }
        	}
        	tempCount = count;
        	
        	if(round>0)
        	{       
        		rounds.add(tempCount);
            	max = Collections.max(rounds);
        	}
//        	else if(round == 0)
//        		max = tempCount;
        	else
        		max = 0;
            System.out.println(max);
        	
        }   	
        return max;
    }

    public static String binaryConversion(int N)
    {
        return Integer.toBinaryString(N);
    }
    
    public static void main(String[] args)
    {
    	solution(1041);
    	
    }

}
