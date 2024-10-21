package package1;

public class NumberToWordsConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberToWords(1450);
	}
	    // write code here
	 public static void numberToWords(int number)
	    {
	        int newNumber = reverse(number);
	        int digitToConvertIntoWord =0;
	        int leadingZeroes = getDigitCount(number) - getDigitCount(newNumber);
	        if(number<0)
	        {
	            System.out.println("Invalid Value");
	        }
	        if (number == 0)
	        {
	            System.out.println("Zero");
	        }
	        while(newNumber!=0)
	        {
	            digitToConvertIntoWord = newNumber%10;
	            newNumber = newNumber/10;
	            switch(digitToConvertIntoWord)
	            {
	                case 0: System.out.println("Zero");
	                        break;
	                case 1: System.out.println("One");
	                		break;
	                case 2: System.out.println("Two");
	                		break;
	                case 3: System.out.println("Three");
	                		break;
	                case 4: System.out.println("Four");
	                		break;
	                case 5: System.out.println("Five");
	                		break;
	                case 6: System.out.println("Six");
	                		break;
	                case 7: System.out.println("Seven");
	                		break;
	                case 8: System.out.println("Eight");
	                		break;
	                case 9: System.out.println("Nine");
	                		break;
	                
	                // default: System.out.println("Invalid Value");
	                // 		break;
	            }
	            for(int i=0;i<leadingZeroes;i++)
	            {
	                System.out.println("Zero");
	            }
	        }
	        
	        
	        
	    }
	    
	    public static int reverse(int number)
	    {
	        int remainder=0;
	        int reversedNumber=0;
	        int count = getDigitCount(number);
	        while(number!=0)
	        {
	            reversedNumber = reversedNumber * 10 + number % 10;
	            number /= 10;
	        }
	        return reversedNumber;
	    }
	    
	    public static int getDigitCount(int number)
	    {
	        int count=0;
	        if(number<0)
	        {
	            return -1;
	        }
	        if(number==0)
	        {
	            count=1;
	        }
	        else
	        {
	            while(number!=0)
	            {
	                int digit = number%10;
	                number = number/10;
	                count++;
	            }
	        }
	        return count; 
	    }
}

