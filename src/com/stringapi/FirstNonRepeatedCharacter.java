package com.stringapi;

import java.util.HashMap;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		
		String str = "jasbdjdablmnclsdzcjnzcs";
		
		System.out.println(str.charAt(getNonRepeatingChar(str)));

	}

	private static int getNonRepeatingChar(String str) {
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i < str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				map.replace(str.charAt(i), map.get(str.charAt(i)) + 1);
			}
			else {
				map.put(str.charAt(i), 1);
			}
		}
		
		for(int i = 0; i <str.length(); i++) {
			if(map.get(str.charAt(i)) == 1)
				return i;
		}
		
		return -1;
	}

}
