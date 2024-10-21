package codility;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayOfElements = {9,3,9,3,9,7,9};
		oddOccurrences(arrayOfElements);	
		//oddOccurrenceNumber(arrayOfElements);
	}

	public static int oddOccurrences(int[] arrayOfElements)
	{
		int oddOneOut = 0;
		for(int i = 0; i<= arrayOfElements.length-1; i++)
		{
			for(int j = i+1; j< arrayOfElements.length; j++)
			{
				if(arrayOfElements[i]==arrayOfElements[j])
				{
					arrayOfElements[i] = 0;
					arrayOfElements[j] = 0;
				}
			}
			if(arrayOfElements[i]>0)
			{
				oddOneOut = arrayOfElements[i];
			}
		}		
		return oddOneOut;
	}
	
	
//	public static int oddOccurrenceNumber(int[] arrayOfElements)
//	{
//		int count = 0;
//		Map<Integer, Integer> mapOfElements = new HashMap<>();
//		for(int i: arrayOfElements)
//		{
//			mapOfElements.put(i, 0);
//		}
//		
//		Iterator<Entry<Integer, Integer>> it = mapOfElements.entrySet().iterator();
//		while(it.hasNext())
//		{
//			Map.Entry<Integer, Integer> key = it.next();
//			if(key.getValue()==)
//		}
//		return 0;
//	}
	
}
