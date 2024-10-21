package package1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee 
{

	private String firstName;
	private String lastName;
	private int hireYear;
	
	
	
	public Employee(String firstName, String lastName, int hireYear) 
	{
		//super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.hireYear = hireYear;
	}



	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		List<Employee> employeeList = new ArrayList(List.of
				(new Employee("Neha","Singh",2019),
				new Employee("Atul","Kumar", 2014),
				new Employee("Richa","Singh", 2012),
				new Employee("Varun","Kumar", 2011)));
		
		sortEmployees(employeeList);
	}
	

	public static void sortEmployees(List<Employee> employeesList)
	{
		class LocalClass
		{
			private Employee employee;
			private String fullName;
			private int totalYearsWorked;
			
			
			public LocalClass(Employee employee) 
			{
				//super();
				this.employee = employee;
				this.fullName = employee.firstName + " " + employee.lastName;
				this.totalYearsWorked = LocalDate.now().getYear() - employee.hireYear;
			}	

			@Override
			public String toString()
			{
				return "%s has been employee for %d years".formatted(fullName, totalYearsWorked);
			}
			
//			List<LocalClass> l = new ArrayList<>();
//			for(Employee e: employeeList)
//			{
//				l.add(new LocalClass(e));
//			}
//			
//			var sortedEmployees = new Comparator<LocalClass>() {
//
//				@Override
//				public int compare(LocalClass o1, LocalClass o2) {
//					// TODO Auto-generated method stub
//					return o1.fullName.compareTo(o2.fullName);
//				}
//			};
		}
		
		
		
	
	}	
	
}
