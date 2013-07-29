package com.hisrv.cracking.chapter2;

public class ListNode {
	public int val;
	public ListNode next;
	public ListNode(int val) {
		this.val = val;
		this.next = null;
	}
	
	public static ListNode create(Integer... vals) {
		int num = vals.length;
		ListNode head = null, prev = null;
		for (int i = 0; i < num; i ++) {
			ListNode node = new ListNode(vals[i]);
			if (head == null) {
				head = node;
			} else {
				prev.next = node;
			}
			prev = node;
		}
		return head;
	}
	
	public void out() {
		ListNode p = this;
		while (p != null) {
			System.out.print(p.val + " ");
			p = p.next;
		}
		System.out.println();
	}
}
