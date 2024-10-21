package com.factoryDesignPatterns;

public class OSFactory 
{

	public OS showFeature(String osFeature)
	{
		if(osFeature.equals("Open"))
		{
			return new Android();
		}
		else if(osFeature.equals("Closed"))
		{
			return new IOS();
		}
		return new Windows();
		
	}
}
