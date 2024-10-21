package com.coreJava;

public class MainClass {

	public static void main(String[] args) throws ClassNotFoundException 
	{
//		int[] a1 = {3,7,9};
//		Employee e = new Employee(a1);
//		e.showData();
//		a1[0] = 13;
//		e.showData();

		//Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		Class3 cl1 = new Class3();
		
		getClass3Instance();
		
		

	}
	public static Class3 getClass3Instance()
	{
		Class3 cl2;
		try
		{
			cl2 = new Class3();
		}
		catch(Throwable t)
		{
			System.out.println(t);
		}
		cl2 = new Class3();
		return cl2;
	}

}
