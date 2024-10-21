package package1;

public class MinutesToYearsDaysCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printYearsAndDays(525600);
	}

	public static void printYearsAndDays(long minutes)
    {
        if(minutes<0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            long YY = minutes/(365*24*60);
            long ZZ = minutes%(24*60);
            System.out.println(minutes+" min = "+YY+" y and "+ZZ+" d");
        }
    }
}
