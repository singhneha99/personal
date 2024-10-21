package package1;

import java.util.ArrayList;
import java.util.List;

public class BreakandContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long []a1 = {1, 2, 3, 4, 5, 6, 7, 8};
		long []a2 = {1, 2, 3, 1};
		isSubset(a1,a2,8,4);
		
	}
	
	 public static String isSubset( long a1[], long a2[], long n, long m) 
	 {
		List<Integer> visitedIndices = new ArrayList<>();
	    int count = 0;
	    String message = "";
	    for(int i=0; i<=m-1; i++)
	    {
	        for(int j=0; j<=n-1; j++)
	        {
	            if(a2[i]==a1[j])
	            {
	            	if(visitedIndices.contains(j))
	            	{
	            		continue;
	            	}
	            	else
	            	{
		                count++;
		                visitedIndices.add(j);
	            	}
	                break;
	            }
	        }
	        
	    }
	    if(count == m)
        {
            message = "Yes";
        }
        else
        {
            message = "No";
        }
	    return message;
	    
	}
	

}
