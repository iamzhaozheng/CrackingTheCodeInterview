package com.hisrv.cracking.chapter4;

import java.util.ArrayList;
import java.util.List;

public class Problem8 {
	private List<List<Integer>> mResult = new ArrayList<List<Integer>> ();
	public List<List<Integer>> findSum(TreeNode root, int sum) {
		List<Integer> path = new ArrayList<Integer> ();
		findSum(root, sum, path);
		return mResult;
	}
	
	private void findSum(TreeNode root, int sum, List<Integer> path) {
		if (root == null) {
			return;
		}
		path.add(root.val);
		int temp = 0;
		for (int i = path.size() - 1; i >= 0; i --) {
			temp += path.get(i);
			if (temp == sum) {
				List<Integer> list = new ArrayList<Integer> ();
				for (int j = path.size() - 1; j >= i; j --) {
					list.add(path.get(j));
				}
				mResult.add(list);
			}
		}
		ArrayList<Integer> p = new ArrayList<Integer> (path);
		findSum(root.left, sum, p);
		p = new ArrayList<Integer> (path);
		findSum(root.right, sum, p);
	}
	
	public static void main(String[] args) {
		TreeNode root = TreeBuilder.create(new String[] {"7", "-1", "2", "1", "3", "5", "-3"});
		List<List<Integer>> list = new Problem8().findSum(root, 6);
		for (List<Integer> l : list) {
			for (Integer v : l) {
				System.out.print(v + "  ");
			}
			System.out.println();
		}
	}
}
