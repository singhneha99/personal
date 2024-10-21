package package1;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertToCentimeters(6, 6));
		System.out.println(convertToCentimeters(6));
	}
	
	public static double convertToCentimeters(int height)
	{
		return 2.54 * height;
		
	}
	
	public static double convertToCentimeters(int heightInFeet, int remainingHeightInInches)
	{
		int heightInInches = heightInFeet * 12 + remainingHeightInInches;		
		return convertToCentimeters(heightInInches);
	}

}
