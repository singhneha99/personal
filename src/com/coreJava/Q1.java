package com.coreJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q1 {

	public static void main(String[] args) 
	{
		Employee1 e1 = new Employee1(1,"Neha", 11);
		Employee1 e2 = new Employee1(2,"Ashish", 11);
		Employee1 e3 = new Employee1(3,"Atul", 12);
		Employee1 e4 = new Employee1(4,"Raksha", 13);
		Employee1 e5 = new Employee1(5,"Ved", 14);
		Employee1 e6 = new Employee1(6,"Richa", 12);
		Employee1 e7 = new Employee1(7,"Varun", 14);
		
		
		List<Employee1> l1 = new ArrayList<>();
		
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		l1.add(e4);
		l1.add(e5);
		l1.add(e6);
		l1.add(e7);
		
		Map<Integer, List<Employee1>> m = l1.stream().collect(Collectors.groupingBy(Employee1::getCompanyId));
		m.entrySet().stream().filter(a -> a.getValue().size() == 1).forEach(System.out::println);
		

	}

}
