package package1;

import java.util.Arrays;
import java.util.Scanner;

public class MinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	private static int readInteger()
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }
    
    private static int[] readElements(int number)
    {
        int[] array1 = new int[5];
        for(int i = 0; i < array1.length; i++)
        {
            array1[i] = readInteger();
        }
        return array1;
    }
    
    private static int findMin(int[] array1)
    {
        Arrays.sort(array1);
        return array1[0];
    }

}
