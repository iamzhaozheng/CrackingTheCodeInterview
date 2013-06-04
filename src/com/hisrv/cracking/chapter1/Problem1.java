package com.hisrv.cracking.chapter1;

import java.util.Arrays;

public class Problem1 {
	public boolean unique(String s) {
		char[] str = s.toCharArray();
		boolean[] flags = new boolean[256];
		Arrays.fill(flags, false);
		for (int i = 0; i < str.length; i ++) {
			if (flags[str[i]]) {
				return false;
			}
			flags[str[i]] = true;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(new Problem1().unique("abc12349780"));
	}
}
