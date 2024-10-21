package com.builderDesignPatterns;

public class PhoneMain {

	public static void main(String[] args) 
	{
		
		Phone phone = new PhoneBuilder().setBattery(31000).getPhone();
		System.out.println(phone.toString());
	}

}
