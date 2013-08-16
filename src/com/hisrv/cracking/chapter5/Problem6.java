package com.hisrv.cracking.chapter5;

public class Problem6 {
	public static int swapOddAndEven(int n) {
		return ((n & (0xaaaaaaaa)) >> 1) | ((n & (0x55555555)) << 1);
	}
}
