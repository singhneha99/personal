package package1;

import java.util.Scanner;

public class InputCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputThenPrintSumAndAverage();
	}

	public static void inputThenPrintSumAndAverage()
    {
		double sum=0;
		int n=5;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number:");
        for(int i=0;i<=n;i++)
        {
	        int num = myObj.nextInt();
	        sum+=num;
	        
        }
        System.out.println("Sum: "+sum+" Average: "+sum/n);
    }
}
