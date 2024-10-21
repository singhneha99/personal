package com.builderDesignPatterns;

public class PhoneBuilder 
{
	private String os;
	private double price;
	private int battery;
	private double screenSize;
	private String brand;
	
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setPrice(double price) {
		this.price = price;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}
	
	
	public Phone getPhone()
	{
		return new Phone(os,price,battery,screenSize,brand);
	}
	
}
