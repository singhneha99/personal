package com.practice.streams;

import java.util.stream.IntStream;

public class IntermediateOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var stream = IntStream.iterate((int)'A', i->i<=(int)'z', i->i+1)
					.summaryStatistics();
		System.out.println(stream);
	}

}
