package com.adapterDesignPatterns;

public class AssignmentWork {

	private PenAdapter penAdapter;

	public PenAdapter getPenAdapter() {
		return penAdapter;
	}

	public void setPen(PenAdapter penAdapter) {
		this.penAdapter = penAdapter;
	}
	
	public void writeAssignment(String str)
	{
		penAdapter.write(str);
	}
}
