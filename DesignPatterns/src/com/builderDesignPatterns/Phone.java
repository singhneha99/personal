package com.builderDesignPatterns;

public class Phone 
{

	private String os;
	private double price;
	private int battery;
	private double screenSize;
	private String brand;
	
	
	public Phone(String os, double price, int battery, double screenSize, String brand) {
		super();
		this.os = os;
		this.price = price;
		this.battery = battery;
		this.screenSize = screenSize;
		this.brand = brand;
	}


	@Override
	public String toString() {
		return "Phone [os=" + os + ", price=" + price + ", battery=" + battery + ", screenSize=" + screenSize
				+ ", brand=" + brand + "]";
	}
	
	
}
