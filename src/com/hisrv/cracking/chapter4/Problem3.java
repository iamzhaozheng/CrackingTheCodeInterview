package com.hisrv.cracking.chapter4;

public class Problem3 {

	private TreeNode makeBinaryTree(int[] arr, int start, int end) {
		if (end < start) {
			return null;
		}
		int mid = (start + end) / 2;
		TreeNode ret = new TreeNode(arr[mid]);
		ret.left = makeBinaryTree(arr, start, mid - 1);
		ret.right = makeBinaryTree(arr, mid + 1, end);
		return ret;
	}
	
	public TreeNode makeBinaryTree(int[] arr) {
		return makeBinaryTree(arr, 0, arr.length - 1);
	}
}
