package package1;

public class PrimeNumberChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(isPrimeNumber(2)? "2 is a prime number":"");
//		System.out.println(isPrimeNumber(3)? "3 is a prime number":"");
//		System.out.println(isPrimeNumber(4)? "4 is a prime number":"");
//		System.out.println(isPrimeNumber(17)? "17 is a prime number":"");
		numberOfPrimeNumbers();
	}

	public static boolean isPrimeNumber(int number)
	{
		int count=0;
		if(number>1)
		{
			for(int i=1; i<=number; i++)
			{
				if(number%i==0)
				{
					count++;
					
				}
			}
			if(count>2)
			{
				return false;
			}
			return true;
			
		}
		return false;
	}
	
	public static int numberOfPrimeNumbers()
	{
		int primeNumberCount=0;
		for(int i=50; i<=100; i++)
		{
			if(isPrimeNumber(i))
			{
				primeNumberCount++;
				System.out.println("The prime numbers is: "+i);
			}
			if(primeNumberCount==3)
			{
				break;
			}
		}
		return primeNumberCount;
	}
}
