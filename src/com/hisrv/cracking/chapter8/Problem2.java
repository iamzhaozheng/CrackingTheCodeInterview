package com.hisrv.cracking.chapter8;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Problem2 {
	public static int computePathNumber(int m, int n) {
		if (m == 1 || n == 1) {
			return 1;
		}
		return computePathNumber(m - 1, n) + computePathNumber(m, n - 1);
	}

	public static List<List<Point>> findPaths(int m, int n, boolean[][] block) {
		List<List<Point>> ret;
		if (block[m - 1][n - 1]) {
			return new ArrayList<List<Point>> ();
		}
		if (m == 1 && n == 1) {
			ret = new ArrayList<List<Point>>();
			List<Point> list = new ArrayList<Point> ();
			list.add(new Point(1, 1));
			ret.add(list);
			return ret;
		}
		if (m == 1) {
			ret = findPaths(m, n - 1, block);
		} else if (n == 1) {
			ret = findPaths(m - 1, n, block);
		} else {
			ret = findPaths(m, n - 1, block);
			ret.addAll(findPaths(m - 1, n, block));
		}
		for (List<Point> list : ret) {
			list.add(new Point(m, n));
		}
		return ret;
	}
	
	public static void main(String[] args) {
		boolean[][] block = new boolean[][] 
				{{false, false, false, false, false}, 
				 {false,  true, false, false, true},
				 {false, false, false,  true, false},
				 {false,  true, false, false, false},
				 { true, false,  false,  true, false}};
		List<List<Point>> paths = findPaths(5, 5, block);
		for (List<Point> list : paths) {
			for (Point p : list) {
				System.out.print(String.format("[%d,%d]  ", p.x, p.y));
			}
			System.out.println();
		}
	}
}
