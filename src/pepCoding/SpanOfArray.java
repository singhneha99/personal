package pepCoding;

public class SpanOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {15, 30, 40, 4, 11, 9};
		
		//Approach1
		/*
		for(int i = 0; i <= arr.length-1; i++)
		{
			for(int j = i+1; j<=arr.length-1; j++)
			{
				int temp = 0;
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;					
				}
			}
		}

		int difference = arr[arr.length-1] - arr[0];
		System.out.println(difference);
		*/
		
		//Approach2
		int min = arr[0];
		int max = arr[0];
		
		for(int i = 0; i<= arr.length-1; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		
		System.out.println(max - min);
	}

}
