package com.compositeDesignPatterns;

public class ComputerTest {

	public static void main(String[] args) 
	{
		Component mouse = new Leaf("Mouse", 500.00);
		Component keyBoard = new Leaf("KeyBoard", 800.00);
		Component joystick = new Leaf("Joystick", 200.00);
		
		Composite peripheral = new Composite("Peripheral");
		Composite motherboard = new Composite("Motherboard");
		
		Composite computer = new Composite("Computer");
		
		peripheral.addComponent(joystick);
		peripheral.addComponent(mouse);
		peripheral.addComponent(keyBoard);
		
		computer.addComponent(motherboard);
		computer.addComponent(peripheral);
		
		computer.showPrice();

	}

}
