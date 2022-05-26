package com.stringapi;

public class CapitalizeFirstLetters {

	public static void main(String[] args) {
		
		String sentence = "i am a java microservices springboot developer";
		String[] words = sentence.split(" ");
		
		for(int i = 0; i < words.length; i++) {
			String first = words[i].substring(0, 1).toUpperCase();
			String after = words[i].substring(1);
			words[i] = first + after;
			System.out.print(words[i] + " ");
		}
		
	}

}
