package com.hisrv.cracking.chapter5;

public class Problem3 {
	
	private static int find(int n, int zeroOrOne) {
		int i = 0;
		while (n != 0 && (n & 1) == zeroOrOne) {
			n >>= 1;
			i ++;
		}
		int not = zeroOrOne == 0 ? 1 : 0;
		while (n != 0 && (n & 1) == not) {
			n >>= 1;
			i ++;
		}
		return i;
	}
	
	private static int set(int n, int idx, int val) {
		if (val == 1) {
			n |= (1 << idx);
		} else {
			n &= ~(1 << idx);
		}
		return n;
	}
	
	public static int getNextSmallest(int n) {
		int idx = find(n, 1);
		if (idx == 0) {
			return -1;
		}
		n = set(n, idx, 0);
		n = set(n, idx - 1, 1);
		int j = idx - 1;
		for (int i = idx - 1; i >= 0; i --) {
			if (((n >> i) & 1) == 1) {
				n = set(n, i, 0);
				n = set(n, j --, 1);
			}
		}
		return n;
	}
	
	public static int getNextLargest(int n) {
		int idx = find(n, 0);
		if (idx == 0) {
			return -1;
		}
		n = set(n, idx, 1);
		n = set(n, idx - 1, 0);
		int j = 0;
		for (int i = 0; i < idx; i ++) {
			if (((n >> i) & 1) == 1) {
				n = set(n, i, 0);
				n = set(n, j ++, 1);
			}
		}
		return n;
	}
	
	public static void main(String[] args) {
		//10: 1010 -> 1100
		//9: 1001 -> 1010
		//11: 1011 -> 1101
		System.out.println(getNextLargest(11));
		//10: 1010 -> 1001
		//9: 1001 -> 1010
		//11: 1011 -> 111
		System.out.println(getNextSmallest(11));
	}
}
