package com.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySum {

	public static void main(String[] args) {
		
		int arr[] = {12,3,4,1,6,9};
		int sum = 24;
		List<Integer> result = new ArrayList<Integer>();
		
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			
			int start = i+1; int end = arr.length - 1;
			
			while(start < end) {
				if(temp + arr[start] + arr[end] == sum) {
					result.add(arr[i]);
					result.add(arr[start]);
					result.add(arr[end]);
					break;
				}
				else if(temp + arr[start] + arr[end] < sum) {
					start++;
				}
				else if(temp + arr[start] + arr[end] > sum) {
					end--;
				}
					
			}
		}
		
		System.out.println(result);
	}

}
