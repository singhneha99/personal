package package1;

public class MethodOverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDurationString(-3690));
	}

	public static String getDurationString(int seconds)
	{
		if(seconds < 0)
		{
			return "Invalid value of seconds";
		}
		int sec = seconds;
		int min = seconds/60;
		return getDurationString(min, sec);
		
	}
	
	public static String getDurationString(int minutes, int seconds)
	{
		if(minutes < 0) 
		{
			return "invalid value of minutes";
		}
		if(seconds < 0 && seconds > 59)
		{
			return "invalid value of seconds";
		}		
		int hour = 0;
		hour = minutes / 60;
		minutes = minutes % 60;
		seconds = seconds % 60;
		return hour + "h " + minutes + "m " + seconds + "s";
	}
	
}
