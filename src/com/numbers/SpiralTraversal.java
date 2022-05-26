package com.numbers;

public class SpiralTraversal {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int rows = arr.length;
		int col = arr[0].length;

		int top = 0, bottom = rows - 1, right = col - 1, left = 0;

		while (top < bottom && left < right) {

			for (int i = top; i <= right; i++) {
				System.out.println(arr[top][i]);
			}
			top++;

			for (int i = top; i <= bottom; i++) {
				System.out.println(arr[i][right]);
			}
			right--;

			for (int i = right; i >= left; i--) {
				System.out.println(arr[bottom][i]);
			}
			bottom--;

			for (int i = bottom; i >= top; i--) {
				System.out.println(arr[i][left]);
			}
			left++;
		}

	}

}
