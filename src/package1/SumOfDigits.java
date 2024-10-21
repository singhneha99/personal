package package1;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumDigits(1257));
	}

	public static int sumDigits(int number)
	{
		int sum=0;
		
		
		if(number<0)
		{
			sum=-1;
		}
		else if(number>0 && number<10)
		{
			sum=number;
		}
		else
		{
			while(number>0)
			{
				int digitValue = number%10;
				number/=10;
				sum+=digitValue;
			}
		}
		return sum;
	}
}
