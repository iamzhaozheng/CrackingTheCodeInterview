package com.hisrv.cracking.chapter4;

public class Problem7 {
	public boolean isSubtree(TreeNode large, TreeNode small) {
		if (isSameTree(large, small)) {
			return true;
		}
		if (large == null) {
			return false;
		} else if (isSubtree(large.left, small) || isSubtree(large.right, small)) {
			return true;
		}
		return false;
	}
	
	private boolean isSameTree(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null) {
			return true;
		} else if (root1 == null) {
			return false;
		} else if (root2 == null) {
			return false;
		} else {
			return root1.val == root2.val && isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
		}
	}
}
