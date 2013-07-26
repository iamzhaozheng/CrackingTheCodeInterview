package com.hisrv.cracking.chapter1;

public class Problem2 {
	public void reverse(char[] s) {
		int end = -1;
		while (s[++ end] != '\0');
		for (int i = 0; i < end / 2; i ++) {
			swap(s, i, end - i - 1);
		}
	}
	
	private void swap(char[] s, int a, int b) {
		if (s[a] != s[b]) {
			s[a] ^= s[b];
			s[b] ^= s[a];
			s[a] ^= s[b];
		}
	}
	
	public static void main(String[] args) {
		char[] s = "123456789\0".toCharArray();
		new Problem2().reverse(s);
		System.out.println(s);
	}
}
