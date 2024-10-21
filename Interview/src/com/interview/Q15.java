package com.interview;

import java.util.HashSet;

//IRIS L2
public class Q15 {

	public static void main(String[] args) 
	{
		Employee1 e1 = new Employee1("Neha");
		Employee1 e2 = new Employee1("Neha");
		
		HashSet<Employee1> hs = new HashSet<>();
		hs.add(e1);
		hs.add(e2);
		
		System.out.println(hs.size());
		
		String s = null;
		boolean b = validate(s);
		System.out.println(b);

	}
	public static boolean validate(String str)
	{
	       if(str != null || !str.equals(""))
	       {
	              return true;
	       }
	       else
	       {
	             return false;
	       }
	}

}
class Employee1
{
	
private String empName;

public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}

public Employee1(String empName) {
	super();
	this.empName = empName;
}


}
