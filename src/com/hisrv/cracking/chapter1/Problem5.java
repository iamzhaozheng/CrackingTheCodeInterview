package com.hisrv.cracking.chapter1;

public class Problem5 {
	public void replace(char[] s) {
		int num = 0;
		int len = 0;
		for (len = 0; s[len] != '\0'; len ++) {
			if (s[len] == ' ') {
				num ++;
			}
		}
		int t = len;
		len = len + num * 2;
		s[len] = '\0';
		int j = len - 1;
		for (int i = t - 1; i >= 0; i --) {
			if (s[i] == ' ') {
				s[j --] = '0';
				s[j --] = '2';
				s[j --] = '%';
			} else {
				s[j --] = s[i];
			}
		}
	}
	
	public static void main(String[] args) {
		char[] s = "ab cde fgh\0                                    ".toCharArray();
		new Problem5().replace(s);
		System.out.println(s);
	}

}
