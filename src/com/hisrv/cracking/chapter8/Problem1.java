package com.hisrv.cracking.chapter8;

public class Problem1 {
	public static int fbo(int n) {
		if (n <= 1) {
			return 1;
		}
		return fbo(n - 2) + fbo(n - 1);
	}
}
