package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda {

	
	record Person(String firstName, String lastName) 
	{

		@Override
		public String toString() {
			return firstName + " " + lastName;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> listOfPersons = new ArrayList<>(Arrays.asList(
										new Person("Neha","Singh"),
										new Person("Raksha","Singh"),
										new Person("Ashish","Singh"),
										new Person("Atul","Kumar"),
										new Person("Richa","Singh"),
										new Person("Varun","Kumar"),
										new Person("Ved","Varun Singh")));
		
		var compareLastName = new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.lastName.compareTo(o2.lastName);
			}
			
		};
		
		listOfPersons.sort((o1,o2)-> o1.lastName.compareTo(o2.lastName));
		System.out.println(listOfPersons);
		
		interface EnhancedComparator<T> extends Comparator<T>
		{
			int secondLevel(T o1,T o2);
		}
		
		var enhancedComparator = new EnhancedComparator<Person>() 
		{

			@Override
			public int compare(Person o1, Person o2)
			{
				// TODO Auto-generated method stub
				int result = o1.lastName.compareTo(o2.lastName);
				return (result == 0 ? secondLevel(o1,o2) : result);
			}

			@Override
			public int secondLevel(Person o1, Person o2) 
			{
				// TODO Auto-generated method stub
				return o1.firstName.compareTo(o2.firstName);
			}
			
		};
		
		listOfPersons.sort(enhancedComparator);
		System.out.println(listOfPersons);
			
	}

}
