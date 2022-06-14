package com.numbers;

import java.util.HashMap;

public class CheckTriplet {

	public static void main(String[] args) {
		
		int arr[] = {3,1,4,5,6,2};
		
		System.out.println(hasTriplet(arr));
	}

	private static boolean hasTriplet(int[] arr) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			if(!map.containsKey(arr[i]))
				map.put(arr[i], 1);
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				int p = (int) Math.sqrt(arr[i]*arr[i] + arr[j]*arr[j]);
				
				if(map.containsKey(p)) {
					return true;
				}
			}
		}
		return false;
	}

}
