package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class LambdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> children = new ArrayList<>(List.of(
								"Neha","Raksha","Richa"));
		
		children.forEach(c -> System.out.println(c));
		
		System.out.println("-------------");
		
		//Predicate - test if a condition is true/false.
		children.removeIf(s -> s.equalsIgnoreCase("Richa"));
		
		children.forEach(c -> System.out.println(c));
		
		
		String prefix = "Ms.";
		children.forEach(myString -> {
			char c = myString.charAt(0);
			System.out.println(c + " for "+ prefix + myString);
			/*prefix = "Mr"; ----- cannot re-assign a value to a variable within scope of the block 
			as it is final by nature.*/
		});
		
		int result = operator((a,b)-> a+b, 5, 4);
		var result1 = operator((a,b) -> a/b, 4.0, 2.5);
		var result2 = operator((a,b)-> a.toUpperCase() + " "+ b.toUpperCase(), "Neha", "Singh");
		
		var coords = Arrays.asList(
						new Double[]{1.4, 2.3},
						new Double[]{-0.3, -1.7},
						new Double[]{2.4, 2.3},
						new Double[]{0.4, 4.2});
		
		coords.forEach(s -> System.out.println("latitude: "+s[0]+" longitude: "+s[1]));
		
		//BiConsumer<Double, Double> points = ((lat, longitude) -> System.out.printf("[lat: %f long: %f]%n", lat, longitude));
//		var firstPoint = coords.get(0);
		coords.forEach(index -> processCoordinates(index[0], index[1], 
								(lat, longitude) ->
													System.out.printf("[lat: %f long: %f]%n", lat, longitude)));
		//processCoordinates(firstPoint[0], firstPoint[1], points);
		
		
		String [] names = new String[] {"Ross","Rachel","Monica","Chandler","Phoebe","Joey"};
		String[] randomNames = generateRandomNames(15,names,
				(() -> new Random().nextInt(names.length)));
		System.out.println(Arrays.asList(randomNames));
	}
	
//	public static <T> T operator(Operation<T> operation, T val1, T val2)
//	{
//		T result = operation.operate(val1, val2);
//		System.out.println("Result: "+ result);
//		return result;
//		
//	}

	//BiFunction Functional Interface
	public static <T> T operator(BinaryOperator<T> operation, T val1, T val2)
	{
		T result = operation.apply(val1, val2);
		System.out.println("Result: "+ result);
		return result;
		
	}
	
	//Consumer Functional Interface
	public static <T> void processCoordinates(T t1, T t2, BiConsumer<T, T> parameter)
	{
		parameter.accept(t1, t2);
		
	}
	
	//Supplier Functional Interface
	public static String[] generateRandomNames(int count, String[] str, Supplier<Integer> s)
	{
		String [] selectedValues = new String[count];
		for(int i=0; i < count; i++)
		{
			selectedValues[i] = str[s.get()];
		}
		return selectedValues;
		
	}
}
