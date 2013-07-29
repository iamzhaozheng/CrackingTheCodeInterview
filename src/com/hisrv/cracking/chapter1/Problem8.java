package com.hisrv.cracking.chapter1;

public class Problem8 {
	private boolean isSubstring(String s, String S) {
		if (S.indexOf(s) == -1) {
			return false;
		}
		return true;
	}
	
	public boolean isRotation(String s1, String s2) {
		String s = s1 + s1;
		if (isSubstring(s2, s)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(new Problem8().isRotation("abcdefghijk", "abce"));
	}
}
