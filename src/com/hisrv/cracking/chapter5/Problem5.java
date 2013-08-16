package com.hisrv.cracking.chapter5;

public class Problem5 {
	public static int differentBits(int n, int m) {
		int c = n ^ m;
		int sum = 0;
		while (c != 0) {
			sum += c & 1;
			c >>= 1;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(differentBits(1, 3));
	}
}
