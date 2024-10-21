package com.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//TechMahindra Q1
public class Q13 {

	public static void main(String[] args) 
	{
		Car c1 = new Car("1xyz");
		Car c2 = new Car("2xyz");
		Car c3 = new Car("3xyz");
		Car c4 = new Car("4xyz");
		Driver d1 = new Driver("Ram","1", 23, c1);
		Driver d2 = new Driver("Shyam","2", 17, c2);
		Driver d3 = new Driver("Ajay","3", 21, c3);
		Driver d4 = new Driver("Kumar","4", 15, c4);
		
		List<Driver> driverList = new ArrayList<>();
		driverList.add(d1);
		driverList.add(d2);
		driverList.add(d3);
		driverList.add(d4);
		
		List<Driver> validDriversList = driverList.stream().filter(a -> a.getAge()>=21 && a.isValid()).collect(Collectors.toList());
		
		Map<Car, List<Driver>> m = new HashMap<>();
		
		m = validDriversList.stream().filter(a -> a.getName().equals("Ram")).collect(Collectors.groupingBy(Driver:: getCar));
		
		m.entrySet().stream().forEach(a -> System.out.println(a.getKey().getRegistrationNumber()));
		
		

	}

}

class Driver
{
	
    private String name;
    private String licenseId;
    private int age;
    private Car car;
    
    
    
	public Driver(String name, String licenseId, int age, Car car) {
		super();
		this.name = name;
		this.licenseId = licenseId;
		this.age = age;
		this.car = car;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLicenseId() {
		return licenseId;
	}
	public void setLicenseId(String licenseId) {
		this.licenseId = licenseId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
    
	public boolean isValid()
	{
		return true;
	}
    
    
}

class Car
{
	private String registrationNumber;

	
	public Car(String registrationNumber) {
		super();
		this.registrationNumber = registrationNumber;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	

}