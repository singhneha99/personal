package com.practice.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String[] words = new String[10];
//        
//        Optional<String> checkNull = Optional.ofNullable(words[5]);
//      
//        if (checkNull.isPresent()) 
//        {
//          String word = words[5].toLowerCase();
//          System.out.print(word);
//        }
//        else
//        {
//          System.out.println("word is null");
//        }
		
		
		ArrayList<Integer> listOfIntegers = (ArrayList<Integer>) List.of(2,9,7,3,-1);
		
//		for(int i = 0; i <= listOfIntegers.size(); i++ )
//		{
//			for(int j = listOfIntegers.size()-1; j > i; j-- )
//			if(listOfIntegers.get(i) > listOfIntegers.get(j))
//			{
//				temp = listOfIntegers.get(i);
//				listOfIntegers.get(j) = listOfIntegers.get(i+1);
//			}
//		}
		for (int i = 0; i < listOfIntegers.size(); i++) {

		    for (int j = listOfIntegers.size() - 1; j > i; j--) {
		        if (listOfIntegers.get(i) > listOfIntegers.get(j)) {

		            int tmp = listOfIntegers.get(i);
		            listOfIntegers.set(i,listOfIntegers.get(j));
		            listOfIntegers.set(j,tmp);

		        }

		    }

		}
		for (int i: listOfIntegers) {
		    System.out.println(i);
		}
		
	}

}
