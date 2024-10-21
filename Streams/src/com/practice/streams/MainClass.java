package com.practice.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("1a","Neha");
		Employee e2 = new Employee("2a","Raksha");
		Employee e3 = new Employee("3a","Ashish");
		Employee e4 = new Employee("4a","Atul");
		Employee e5 = new Employee("5a","Ved");
		Employee e6 = new Employee("6a","Richa");
		Employee e7 = new Employee("7a","Varun");
		
		List<Employee> l = new ArrayList<>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		l.add(e6);
		l.add(e7);
		
		//l.stream().map(Employee::getName).filter(a -> a.startsWith("V") || a.startsWith("A")).sorted().collect(Collectors.toList()).forEach(a -> System.out.println(a));
		var secondCharacter = new Comparator<Employee>()
		{

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getName().substring(1, 2).compareTo(o2.getName().substring(1, 2));
			}
	
		};
		
		List<Employee> sortedByName = l.stream().sorted(Comparator.comparing(Employee::getName).reversed()).filter(a -> a.getName().startsWith("A")).collect(Collectors.toList());
		sortedByName.forEach(System.out::println);
		
		
		

	}

}
