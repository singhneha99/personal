package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		/*
		Given an integer array nums and an integer k, return the kth largest element in the array. Note that it is the kth largest element in the sorted order, not the kth distinct element.




		Examples:

		Input: nums = [3,2,1,5,6,4], k = 2 Output: 5
		Input: nums = [3,2,3,1,2,4,5,5,6], k = 4 Output: 4
		 */
//		class Main {
//
//		    public static void main(String[] args) {
//		        int[] nums = {3,2,1,5,6,4};
//		        int k = 2;
//		        List<Integer> l1 = new ArrayList<>();
//
//		        for(int i = 0; i <= nums.length-1; i++)
//		        {
//		            l1.add(nums[i]);
//		        }
//
//		        l1 = l1.stream().sorted(Comparator.reverseOrder()).limit(k).collect(Collectors.toList());
//
//		       Integer kthLargest = l1.get(l1.size()-1);
//
//		       System.out.println(kthLargest);
//
//
//		    }
//		}
		
		
		int[] nums = {3,2,1,5,6,4};
		int k = 2;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> b-a);
		
		for(Integer i: nums)
		{
			pq.add(i);
		}
		
		System.out.println(pq);
		List<Integer> l = pq.stream().limit(k).collect(Collectors.toList());

	}

}
