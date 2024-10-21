package CodingStrings;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Neha Singh";
		s = s.replace(" ", "");
		
		Character ch = s.chars().mapToObj(c -> Character.toLowerCase(Character.valueOf((char)c)))
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap:: new, Collectors.counting()))
		.entrySet().stream().filter(i -> i.getValue() == 1)
		.map(i -> i.getKey())
		.findFirst().get();
		 
		 System.out.println(ch);
		 
		 
		 List<Integer> li = List.of(2,1,7,56,33);
		 li = li.stream().distinct().filter(i -> i % 2 == 0).collect(Collectors.toList());
		 System.out.println(li.toString());
		
		

	}

}
