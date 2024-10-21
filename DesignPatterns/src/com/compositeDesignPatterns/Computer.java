package com.compositeDesignPatterns;

import java.util.ArrayList;
import java.util.List;

interface Component
{
	void showPrice();
}


class Leaf implements Component
{

	String name;
	Double price;
	
	public Leaf(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public void showPrice() 
	{		
		System.out.println(name + " : " + price);
	}

}

class Composite implements Component
{

	List<Component> listOfComponents = new ArrayList<>();
	
	String name;	
	
	public Composite(String name) {
		super();
		this.name = name;
	}

	@Override
	public void showPrice() 
	{
		System.out.println(name);
		for(Component c: listOfComponents)
		{
			c.showPrice();
		}
		
	}
	
	public void addComponent(Component component)
	{
		listOfComponents.add(component);
	}

}
