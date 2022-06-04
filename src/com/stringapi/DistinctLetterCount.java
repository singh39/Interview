package com.stringapi;

import java.util.HashMap;
import java.util.Map.Entry;

public class DistinctLetterCount {

	public static void main(String[] args) {
		
		String str = "jkasndwjisxmamsxndwlkasowed";
		
		getFrequency(str);

	}

	private static void getFrequency(String str) {
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i < str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			}
			else {
				map.put(str.charAt(i), 1);
			}
		}
		
		for(Entry<Character, Integer> k: map.entrySet()) {
			System.out.println(k.getKey() + " : " + k.getValue());
		}
		
	}

}
