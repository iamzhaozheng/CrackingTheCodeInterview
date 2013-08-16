package com.hisrv.cracking.chapter5;

public class Problem1 {
	//n:10101 0101 01101
	//m:1110
	//i:6 j:9
	public static int setBits(int n, int m, int i, int j) {
		int mask = ~(((1 << m) - 1) << (i - 1));
		return n & mask | (m << (i - 1));
	}
	
}
