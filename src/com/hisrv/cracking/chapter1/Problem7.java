package com.hisrv.cracking.chapter1;

public class Problem7 {
	public void setMatrixZero(int[][] mat) {
		int n = mat.length;
		int m = mat[0].length;
		boolean topZero = false;
		boolean leftZero = false;
		for (int i = 0; i < n; i ++) {
			if (mat[i][0] == 0) {
				leftZero = true;
			}
		}
		for (int i = 0; i < m; i ++) {
			if (mat[0][i] == 0) {
				topZero = true;
			}
		}
		for (int i = 1; i < n; i ++) {
			for (int j = 1; j < m; j ++) {
				if (mat[i][j] == 0) {
					mat[i][0] = mat[0][j] = 0;
				}
			}
		}
		for (int i = 1; i < n; i ++) {
			for (int j = 1; j < m; j ++) {
				if (mat[0][j] == 0 || mat[i][0] == 0) {
					mat[i][j] = 0;
				}
			}
		}
		if (topZero) {
			for (int i = 0; i < m; i ++) {
				mat[0][i] = 0;
			}
		}
		if (leftZero) {
			for (int i = 0; i < n; i ++) {
				mat[i][0] = 0;
			}
		}
	}
	
	public static void main(String[] args) {
	}
}
