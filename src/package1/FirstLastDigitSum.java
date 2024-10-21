package package1;

public class FirstLastDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//sumFirstAndLastDigit(11);
		getEvenDigitSum(252);
	}

//	 public static int sumFirstAndLastDigit(int number)
//	    {
//	        int sum=0;
//	        if(number < 0)
//	        {
//	            sum = -1;
//	        }
//	        else if(number<=9)
//	        {
//	            sum=number+number;
//	        }
//	        else
//	        {
//	            int lastDigit = number%10;
//	            int firstDigit=0;
//	            while(number>0)
//	            {
//	            	firstDigit=number;
//	            	number =number/10;
//	            	
//	                continue;
//	            }
//	            sum=lastDigit+firstDigit;
//	        }
//	        return sum;
//	    }
	
	public static int getEvenDigitSum(int number)
    {
        int sum=0;
        if(number<0)
        {
            sum=-1;
        }
        else
        {
            int digit=number%10;
            
            if(digit%2==0)
            {
                sum+=digit;
            }
            number=number/10;
        }
        return sum;
    }
}
