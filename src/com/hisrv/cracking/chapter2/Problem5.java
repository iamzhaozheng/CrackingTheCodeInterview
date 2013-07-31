package com.hisrv.cracking.chapter2;

public class Problem5 {
	public int findTheCross(ListNode head) {
		ListNode fast = head, slow = head;

		do {
			if (fast == null || fast.next == null) {
				return -1;
			}
			fast = fast.next.next;
			slow = slow.next;
		} while (fast != slow);
		slow = head;
		while (fast != slow) {
			fast = fast.next;
			slow = slow.next;
		}
		return fast.val;
	}
	
	public static void main(String[] args) {
		ListNode head = ListNode.create(1, 2, 3, 4, 5, 6, 7, 8, 9);
		ListNode p = head;
		for (int i = 1; i < 4; i ++) {
			p = p.next;
		}
		ListNode q = head;
		while (q.next != null) {
			q = q.next;
		}
		q.next = p;
		System.out.print(new Problem5().findTheCross(head));
	}
}
