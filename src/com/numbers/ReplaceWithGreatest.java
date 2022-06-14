package com.numbers;

public class ReplaceWithGreatest {

	public static void main(String[] args) {
		
		int arr[] = {16, 17, 4, 3, 5, 2};
		
		int[] result = modify(arr);
				
		result = modifyAlter(arr);
		
		printArray(result);

	}

	private static int[] modifyAlter(int[] arr) {
		
		int size = arr.length;
		
		int max_till_now = Integer.MIN_VALUE;
		
		arr[size - 1] = -1;
		
		for(int i = size - 2; i >= 0; i--) {
			
			max_till_now = Math.max(max_till_now, arr[i]);
			
			arr[i] = max_till_now;
			
		}
		
		return arr;
	}

	private static void printArray(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

	private static int[] modify(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int j = i + 1;
			int max = -1;
			while (j < arr.length) {
				max = Math.max(max, arr[j]);
				j++;
			}

			arr[i] = max;
		}

		return arr;

	}

}
