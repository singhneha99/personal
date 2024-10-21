package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class LambdaExpressionChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listOfIntegers = new ArrayList<>(List.of(4,7,9,10,56,43));
		List<Integer> evenNumbers = listOfIntegers.stream()
									.filter(s -> s%2==0)
									.collect(Collectors.toList());
		
		System.out.println(evenNumbers);
		
		
		operator(Integer :: sum, 10,12);
		operator(Double :: sum, 10.9,23.4);
		
	}
	
	
	private static <T> T operator(BinaryOperator<T> function, T val1, T val2)
	{
		T result = function.apply(val1, val2);
		System.out.println(result);
		return result;
	}
		
}
