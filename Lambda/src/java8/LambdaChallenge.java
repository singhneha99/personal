package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<String> printTheParts = sentence -> 
		{
			Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));				
		};
				
//		Predicate isEmptyString = str -> ((String) str).isEmpty();		
//		System.out.println(isEmptyString.test("Hi Kittu!"));
		//Predicate isEmpty = str -> str.	
				
			//Consumer<String> printTheWords = new Consumer<String>() {
			
//			@Override
//			public void accept(String sentence) {
//				// TODO Auto-generated method stub
//				String[] parts = sentence.split(" ");
//				for(String part: parts)
//				{
//					System.out.println(part);
//				}
//			}
			
		//};
		
		List<String> listOfStrings = new ArrayList<>(List.of("Neha","Raksha"));
		//Stream listStream = listOfStrings.stream();
		
		listOfStrings = listOfStrings.stream()
						.map(String::toUpperCase)
						.collect(Collectors.toList());
		
		listOfStrings.forEach(s -> System.out.println(s));
		//printTheParts.accept("My name is Neha.");
		//printTheWords.accept("My name is Raksha");
		
		
		
		
		//-----------------------------------
		
		
		  
	}

	
}
