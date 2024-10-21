package com.practice.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapSortingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Parts, Integer> mapp = new HashMap<>();
		
		mapp.put(new Parts("steering","tractor steering",100), 100);
		mapp.put(new Parts("cultivator","Cultivator",100), 400);
		mapp.put(new Parts("Engine","Engine",100), 300);
		
		
		Map<String, Integer> mapp1 = new HashMap<>();
		mapp1.put("Neha", 29);
		mapp1.put("Ved", 2);
		mapp1.put("Atul", 33);
		
		List<Entry<Parts, Integer>> entries = new ArrayList<>(mapp.entrySet());
		
		//Lambda
		//Collections.sort(entries,(o1,o2) -> o1.getKey().getPartsName().compareToIgnoreCase(o2.getKey().getPartsName()));

//			@Override
//			public int compare(Entry<Parts, Integer> o1, Entry<Parts, Integer> o2) {
//				// TODO Auto-generated method stub
//				return o1.getKey().getPartsName().compareToIgnoreCase(o2.getKey().getPartsName());
//			}});
//		
//		for(Entry<Parts, Integer> k: entries)
//		{
//			System.out.println(k.getKey().getPartsName() + "  "+ k.getValue());
//		}
		
		Comparator<Parts> parts = ((Parts p1, Parts p2)-> p1.getPartsName().compareToIgnoreCase(p2.getPartsName()));
		//Map<Parts, Integer> sortedMap = 
				mapp.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(parts)).collect(Collectors.toList()).forEach(a -> System.out.println(a.getKey().getPartsName() + " "+ a.getValue()));

	}

}
