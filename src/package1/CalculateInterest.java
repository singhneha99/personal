package package1;

public class CalculateInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double interest =0.0;
		for(double rate = 7.5; rate<=10; rate=rate+0.25)
		{
			interest = calculateInterest(100.0, rate);
			System.out.println(interest);
		}
		
		
		
	}

	public static double calculateInterest(double principal, double rate)
	{
		double interest=0.0;
		interest = principal*(rate/100);
		return interest;
	}
}
