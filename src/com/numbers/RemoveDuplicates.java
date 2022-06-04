package com.numbers;

import java.util.Arrays;

public class RemoveDuplicates {
	
	static int count = 0;

	public static void main(String[] args) {
		Integer arr[] = { 2, 4, 2, 1, 5, 6, 2, 4, 7, 9 };
		printResult(removeDuplicates(arr));

	}

	private static void printResult(Integer[] arr) {
		for (int i = 0; i <= count; i++) {
			System.out.println(arr[i]);
		}
	}

	private static Integer[] removeDuplicates(Integer[] arr) {
		Arrays.sort(arr);
		int n = arr.length;
		int j = 0;
		for (int i = 0; i < n-1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
				count++;
			}
		}

		arr[j++] = arr[n - 1];

		return arr;

	}

}
