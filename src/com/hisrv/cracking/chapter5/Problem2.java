package com.hisrv.cracking.chapter5;

public class Problem2 {
	public static String getBinary(String sz) {
		double f = Double.parseDouble(sz);
		int i = (int) f;
		f = f - i;
		StringBuilder sb = new StringBuilder();
		while (i != 0) {
			sb.append(i % 2);
			i /= 2;
		}
		sb.reverse();
		sb.append(".");
		while (f > 0.0) {
			if (sb.length() > 32) {
				return "ERROR";
			}
			f *= 2;
			if (f >= 1) {
				f -= 1;
				sb.append(1);
			} else {
				sb.append(0);
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.print(getBinary("10.25"));
	}
}
