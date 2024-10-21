package com.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class Employee
{
	Integer id;
	String name;
	Integer salary;
	Integer age;
	
	
	
	public Employee(Integer id, String name, Integer salary, Integer age) {		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getSalary() {
		return salary;
	}



	public void setSalary(Integer salary) {
		this.salary = salary;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	
	
	
	
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		List<Integer> l1 = List.of(2,8,5,3,9,9);
//
//		 Integer secondLargest = l1.stream()
//				 					.sorted((a,b)->b.compareTo(a))				 					
//				 					.skip(2)
//				 					.findFirst().orElse(0);
//		 
//		 System.out.println(secondLargest);
		 
		 
		 
		 Employee e1 = new Employee(1, "Srikanth", 70000, 25);
		 Employee e2 = new Employee(2, "Ankit", 60000, 26);
		 Employee e3 = new Employee(3, "Rahul", 80000, 21);
		 
		 List<Employee> eList = new ArrayList<>();
		 
		 eList.add(e1);
		 eList.add(e2);
		 eList.add(e3);
		 
		 List<Employee> result = eList.stream().filter(e-> e.getSalary() > 60000).sorted((a,b) -> a.getAge().compareTo(b.getAge())).collect(Collectors.toList());
		 for(Employee e: result)
		 {
			 System.out.println(e.getName() + " " + e.getAge());
		 }
	}

}
