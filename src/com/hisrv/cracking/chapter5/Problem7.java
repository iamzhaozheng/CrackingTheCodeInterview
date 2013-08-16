package com.hisrv.cracking.chapter5;

public class Problem7 {
	public static int findLost(int[] a) {
		int n = a.length + 1;
		int r = 0;
		for (int i = 0; i < a.length; i ++) {
			r ^= a[i];
		}
		for (int i = 1; i <= n; i ++) {
			r ^= i;
		}
		return r;
	}
	
	public static void main(String[] args) {
		System.out.println(findLost(new int[] {1, 6, 2, 5, 3, 7}));
	}
}
