package com.hisrv.cracking.chapter1;

public class Problem3 {
	public void removeDuplicates(char[] s) {
		int start = 0;
loop:	for (int i = 0; i < s.length; i ++) {
			for (int j = 0; j < s.length; j ++) {
				if (j != i && s[i] == s[j]) {
					continue loop;
				}
			}
			swap(s, start ++, i);
		}
		if (start < s.length) {
			s[start] = '@';
		}
	}
	
	private void swap(char[] s, int a, int b) {
		if (a != b) {
			s[a] ^= s[b];
			s[b] ^= s[a];
			s[a] ^= s[b];
		}
	}
	
	public static void main(String[] args) {
		char[] s = "abcdefghijkkgjihgfedcb".toCharArray();
		new Problem3().removeDuplicates(s);
		System.out.println(s);
	}

}
