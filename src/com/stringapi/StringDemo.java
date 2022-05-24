package com.stringapi;

public class StringDemo {

	public static void main(String[] args) {
		
		String sentence = "i am a java microservices springboot developer";
		String[] words = sentence.split(" ");
		
		for(int i = 0; i < words.length; i++) {
			words[i].substring(0, 1).toUpperCase();
			System.out.println(words[i]);
		}
		
		
	}

}
