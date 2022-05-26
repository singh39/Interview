package com.numbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpression {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(23,62,48,37,8,19,73,64);
		
		Stream<Integer> numStream = numbers.stream();
		
		numStream
		.sorted()
		.forEach(item -> System.out.println(item));
		
	}

}
