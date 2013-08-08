package com.hisrv.cracking.chapter4;

import java.util.LinkedList;

public class TreeBuilder {
	public static TreeNode create(String[] l) {
		if (l.length == 0) {
			return null;
		}
		TreeNode root = new TreeNode(Integer.parseInt(l[0]));
		TreeNode p = root;
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		int i = 1;
		boolean left = true;
		while (i < l.length) {
			if (l[i].equals("#")) {
				if (left) {
					p.left = null;
				} else {
					p.right = null;
					p = queue.remove();
				}
			} else {
				if (left) {
					p.left = new TreeNode(Integer.parseInt(l[i]));
					queue.add(p.left);
				} else {
					p.right = new TreeNode(Integer.parseInt(l[i]));
					queue.add(p.right);
					p = queue.remove();
				}
			}
			left = !left;
			i ++;
		}
		return root;
	}
	
	public static TreeNodeWithParent createWithParent(String[] l) {
		if (l.length == 0) {
			return null;
		}
		TreeNodeWithParent root = new TreeNodeWithParent(Integer.parseInt(l[0]));
		TreeNodeWithParent p = root;
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		int i = 1;
		boolean left = true;
		while (i < l.length) {
			if (l[i].equals("#")) {
				if (left) {
					p.left = null;
				} else {
					p.right = null;
					p = (TreeNodeWithParent)queue.remove();
				}
			} else {
				if (left) {
					p.left = new TreeNodeWithParent(Integer.parseInt(l[i]));
					((TreeNodeWithParent)p.left).parent = p;
					queue.add(p.left);
				} else {
					p.right = new TreeNodeWithParent(Integer.parseInt(l[i]));
					((TreeNodeWithParent)p.right).parent = p;
					queue.add(p.right);
					p = (TreeNodeWithParent)queue.remove();
				}
			}
			left = !left;
			i ++;
		}
		return root;
	}
	
	public static void out(TreeNode root) { 
		if (root == null) {
			System.out.println("#");
			return;
		}
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.push(root);
		TreeNode p = root;
		System.out.print(p.val);
		while (!queue.isEmpty()) {
			p = queue.poll();
			System.out.print(",");
			if (p.left != null) {
				queue.push(p.left);
				System.out.print(p.left.val);
			} else {
				System.out.print("#");
			}
			System.out.print(",");
			if (p.right != null) {
				queue.push(p.right);
				System.out.print(p.right.val);
			} else {
				System.out.print("#");
			}
		}
		System.out.println();
	}
}
