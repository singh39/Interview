package com.numbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonElementMatrix {

	public static void main(String[] args) {
		int arr[][] = { { 12, 1, 14, 3, 16 }, { 14, 2, 1, 3, 35 }, { 14, 1, 14, 3, 11 }, { 14, 25, 3, 2, 1 },
				{ 1, 18, 3, 21, 14 } };

		int row = arr.length;
		int col = arr[0].length;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < col; i++) {
			map.put(arr[0][i], 1);
		}
		
		for(int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(map.containsKey(arr[i][j]) && map.get(arr[i][j]) == i) {
					map.put(arr[i][j], map.get(arr[i][j]) + 1);
				}
			}
		}
		
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			if(entry.getValue() == row)
				System.out.println(entry.getKey());
		}
		
	}

}
