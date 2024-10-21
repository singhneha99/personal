package com.interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q20 {

	//TCS - 26/09/2024
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee2 e1 = new Employee2(1,"Anil", 10000.00,"IT");
		Employee2 e2 = new Employee2(2,"Rama", 15000.00,"IT");
		Employee2 e3 = new Employee2(3,"Anchal", 8000.00,"Sales");
		Employee2 e4 = new Employee2(4,"Kartik", 12000.00,"Accounting");
		Employee2 e5 = new Employee2(5,"Ramesh", 13000.00,"Accounting");
		Employee2 e6 = new Employee2(6,"Anil", 10000.00, "Sales");
		
		List<Employee2> e = new ArrayList<>();
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
		e.add(e5);
		e.add(e6);
		
		
//		e.stream().
//		collect(Collectors.groupingBy(Employee2::getDept), Collectors.collectingAndThen
//		(Collectors.maxBy
//		(Comparator.comparingDouble(
//		Employee2::getSalary)), e->e.get())));
		
		
		List<Employee2> sortedEmployees = e.stream().sorted(Comparator.comparing(Employee2::getName).thenComparing(Comparator.comparing(Employee2::getSalary))).collect(Collectors.toList());
		
		for(Employee2 emp: sortedEmployees)
		{
			System.out.println(emp.toString());
		}

	}

}

class Employee2
{
	
	private int id;
	private String name;
	private Double salary;
	private String dept;
	
	
	
	
	
	
	public Employee2(int id, String name, Double salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return name;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	

}