package com.adapterDesignPatterns;

public class School {

	public static void main(String[] args) 
	{
		AssignmentWork aw = new AssignmentWork();
		//Assignment1 a1 = new Assignment1();
		PenAdapter penAdapter = new PenAdapter();
		aw.setPen(penAdapter);
		aw.writeAssignment("I'm bit tired to write an assignment.");
		
		//a1.write();
	}

}
