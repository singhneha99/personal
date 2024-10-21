package package1;

public class BigSmallPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getLargestPrime(12);
	}

	public static int getLargestPrime(int number)
    {
        int j=2;
        int max=0;
        int count=0;
        if(number<=0 || number==1)
        {
            return -1;
        }
        while(j <= number/2)
        {
            if(number%j==0)
            {
                for(int i=2; i<=j; i++)
                {
                	if(j%i==0)
                	{
                		count++;
                		
                	}
                }
                if(count>2)
                {
                	break;
                }
                max=j;
                //count++;
                
            }
            
            j++;
        }
        if(max==0)
        {
        	max=number;
        }
        return max;
    }
}


