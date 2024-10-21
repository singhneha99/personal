package package1;

public class Program1 {

	public static void main(String[] args)
	{
//		System.out.println("Hello World");  
		printConverison(25.42);
	}
	
	public static long toMilesPerHour(double kilometersPerHour)
    {
        long milesPerHour = 0L;
        if(kilometersPerHour < 0)
        {
            return -1;
        }
        else{
            milesPerHour = Math.round(kilometersPerHour/1.609);
        }
        return milesPerHour; 
    }
    
    public static void printConverison(double kilometersPerHour)
    {
        Long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour+" mi/h"  );
    }
}
