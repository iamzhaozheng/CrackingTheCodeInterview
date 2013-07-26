package com.hisrv.cracking.chapter1;

import java.util.HashMap;

public class Problem4 {
	public boolean anagrams(char[] a, char[] b) {
		if (a.length != b.length) {
			return false;
		}
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		//build
		for (int i = 0; i < a.length; i ++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}
		}
		//check
		for (int i = 0; i < b.length; i ++) {
			if (map.containsKey(b[i])) {
				int v = map.get(b[i]);
				if (v > 0) {
					map.put(b[i], v - 1);
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(new Problem4().anagrams("gele".toCharArray(), "leag".toCharArray()));
	}
}
