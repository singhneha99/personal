package pepCoding;

public class FindIndexOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {15,30,40,10,11,9,40};
		int index = -1;
		for(int i = 0; i<arr.length; i++)
		{
			
			if(arr[i] == 80)
			{
				index = i;
				System.out.println(index);
			}			
		}
		
	}

}
