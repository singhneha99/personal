package package1;

public class AreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public double area(double radius)
	{
		if(radius < 0)
		{
			return -0.1;
		}
		return Math.PI*radius*radius;
		
	}
	
	public double area(double x, double y)
	{
		if(x<0 || y<0 || (x<0 && y<0))
		{
			return -0.1;
		}
		else
		{
			return x*y;
		}
	}
}
