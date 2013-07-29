package com.hisrv.cracking.chapter2;

public class Problem2 {
	
	public int findLastNth(ListNode head, int n) {
		ListNode p = head;
		for (int i = 0; i < n; i ++) {
			if (p == null) {
				return -1;
			} else {
				p = p.next;
			}
		}
		ListNode q = head;
		while (p != null) {
			p = p.next;
			q = q.next;
		}
		return q == null ? -1 : q.val;
	}
	
	public static void main(String[] args) {
		ListNode head = ListNode.create(1, 2, 3, 4, 5, 6, 7);
		System.out.print(new Problem2().findLastNth(head, 7));
	}
}
