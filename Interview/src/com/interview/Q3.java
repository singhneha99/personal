package com.interview;

import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Q3 implements Cloneable{

	@Override
    protected Object clone() 
    throws CloneNotSupportedException 
    { 
        return super.clone(); 
    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> li = List.of("abc", "abcdefgh", "abcdef");

		TreeMap<String, Integer> map1 = new TreeMap<>();

		for(String s: li)
		{
			map1.put(s, s.length());
		}

		Integer largestSize = map1.lastEntry().getValue();

		System.out.println(largestSize);
		
		
		
		List<Integer> stringSize = li.stream().sorted().map(a -> a.length()).collect(Collectors.toList());
		
		System.out.println(stringSize.get(stringSize.size()-1));
		
		//System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		ThreadGroup t = Thread.currentThread().getThreadGroup();
		t.list();
		
		
		Thread[] threads = new Thread[t.activeCount()];
		t.enumerate(threads);
		for(Thread th: threads)
		{
			System.out.println(th.getName());
		}
	}

}
