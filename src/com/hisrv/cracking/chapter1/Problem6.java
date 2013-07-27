package com.hisrv.cracking.chapter1;

public class Problem6 {
	public void rotateImage(int[][] image) {
		int l = image.length;
		for (int i = 0; i < (l + 1) / 2; i ++) {
			for (int j = 0; j < l / 2; j ++) {
				int lt = image[i][j];
				image[i][j] = image[l - j - 1][i];
				image[l - j - 1][i] = image[l - i - 1][l - j - 1];
				image[l - i - 1][l - j - 1] = image[j][l - i - 1];
				image[j][l - i - 1] = lt;
			}
		}
	}
	
	public static void main(String[] args) {
//		int[][] image = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17,18, 19, 20}, {21, 22, 23, 24, 25}};
		int[][] image = {{1, 2, 3, 4}, {6, 7, 8, 9}, {11, 12, 13, 14}, {16, 17,18, 19}};
		int l = image.length;
		new Problem6().rotateImage(image);
		for (int i = 0; i < l; i ++) {
			for (int j = 0; j < l; j ++) {
				System.out.print(image[i][j] + " ");
			}
			System.out.println();
		}
	}
}
