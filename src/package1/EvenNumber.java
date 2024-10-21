package package1;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=4;
		int numberOfEvenNumbers=0;
		int numberOfOddNumbers=0;
		while(i<=20)
		{
			i++;
			if(isEvenNumber(i))
			{
//				if(numberOfEvenNumbers==5)
//				{
//					break;
//				}
				System.out.println("Even numbers are: "+i);
				numberOfEvenNumbers++;
			}
			else if(!isEvenNumber(i))
			{
				System.out.println("Odd numbers are: "+i);
				numberOfOddNumbers++;
			}
			
		}
		System.out.println("Number of even numbers found: "+numberOfEvenNumbers);
		System.out.println("Number of odd numbers found: "+numberOfOddNumbers);
	}
	
	public static boolean isEvenNumber(int number)
	{
		if(number%2==0)
		{
			return true;
		}
		return false;
	}

}
