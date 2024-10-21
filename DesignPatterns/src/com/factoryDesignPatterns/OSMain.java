package com.factoryDesignPatterns;

public class OSMain {

	public static void main(String[] args) 
	{
		OSFactory osf = new OSFactory();
		OS os = osf.showFeature("Open");
		os.showFeature();
		

	}

}
