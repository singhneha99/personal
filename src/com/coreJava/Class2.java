package com.coreJava;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Class2 
{
	public static void main(String[] args) throws NumberFormatException
	{
		showDetails();
	}

	public static int showDetails() throws NumberFormatException
	{
		try 
		{
			return Integer.valueOf("Neha");
		}	
		catch(ArithmeticException e)
		{
			throw new ArithmeticException(e.getMessage());
		}
//		catch(Exception e)
//		{
//			throw new Exception(e.getMessage());
//		}
		catch(NumberFormatException e)
		{
			throw new NumberFormatException(e.getMessage());
		}
		
	}
	
	public void printName()
	{
		System.out.println("Neha");
	}
}
