package com.numbers;

public class CountSetBits {

	public static void main(String[] args) {
		
		int n = 3;
		System.out.println(getCountBits(n));

	}

	private static int getCountBits(int n) {
		
		int bitCount = 0;
		for(int i = 1; i <= n; i++) {
			bitCount += countBits(i);
		}
		
		return bitCount;
		
	}

	private static int countBits(int i) {
		if(i <= 0)
			return 0;
		
		return (i % 2 == 0 ? 0 : 1) + countBits(i/2);
	}

}
