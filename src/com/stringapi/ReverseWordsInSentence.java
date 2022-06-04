package com.stringapi;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		
		String str = "I am a java programmer";
		
		System.out.println(reverseString(reverseWords(str)));
		
	}

	private static String reverseWords(String str) {
		String result = "";
		String arr[] = str.split(" ");
		
		for(int i = 0; i < arr.length; i++) {
			result = result.concat(reverseString(arr[i]) + " ");
		}
		return result;
		
	}

	private static String reverseString(String str) {
		String nstr = "";
		for(int i = 0; i < str.length(); i++) {
			
			char ch= str.charAt(i); //extracts each character
	        nstr= ch + nstr;
		}
		return nstr;
		
	}

}
