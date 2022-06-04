package com.numbers;

import java.util.Arrays;
import java.util.Optional;

public class FindMaxAndMin {

	public static void main(String[] args) {
		
		Integer arr[] = {2,56,23,12,89,45,66};
		Optional<Integer> max = Arrays.stream(arr).max((o1,o2)->(o1 - o2));
		Optional<Integer> min = Arrays.stream(arr).min((o1,o2)->(o1-o2));
		
		if(max.isPresent() && min.isPresent())
			System.out.println(max.get()+ " " + min.get());
		else
			System.out.println("Null");

	}

}
