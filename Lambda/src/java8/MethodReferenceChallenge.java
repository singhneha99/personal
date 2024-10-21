package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;

public class MethodReferenceChallenge {

	
	record Person(String firstName, String lastName) {};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String[] children = {"Neha","Raksha","Richa"};
//		
//		List<UnaryOperator<String>> u = new ArrayList<>(List.of(String::toUpperCase));
//		
//		modifyStrings(children, u);
//	}
//	
//	public static void modifyStrings(String [] str,List<UnaryOperator<String>> listOfOperations)
//	{
//		List<String> names = Arrays.asList(str);
//		
//		for(var s: listOfOperations)
//		{
//			names.replaceAll(t -> t.transform(s));
//			System.out.println(names.toString());
//		}
		
		
		
		List<Person> persons =  new ArrayList<>(List.of(
				new Person("Neha","Kaur"),
				new Person("Raksha","Kumari"),
				new Person("Ashish","Kumar")
				));
		
		persons.sort(Comparator.comparing(Person::lastName).thenComparing(Person::firstName));
		persons.forEach(System.out::println);
		
		
		persons.sort(Comparator.comparing(Person::lastName).thenComparing(Person::firstName).reversed());
		persons.forEach(System.out::println);
	}
	

}
