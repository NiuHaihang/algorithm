package algorithm.leetcode19.RemoveNthNodeFromEnd;

public class RemoveNthFromEnd {
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		if(n < 1) return head;
        
        ListNode temp = head;
		int l = 1;
		while(temp.next != null && l < n) {
			temp= temp.next;
			l++;
		}
		if(temp.next == null) {
            head = head.next;
            return head;
        }
        
        ListNode h1 = head;
		ListNode h2 = head;

		
		for(int i = 1; i <= n; i++) {
			h1 = h1.next;
		}
		while(h1.next != null) {
			h1 = h1.next;
			h2 = h2.next;
		}
		h2.next = h2.next.next;
		return head;
	}
	
	public static void main(String args[]) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		node.next.next.next = new ListNode(4);
		node.next.next.next.next = new ListNode(5);
		ListNode node2 = removeNthFromEnd(node, 5);
		while(node2 != null) {
			System.out.println(node2.val);
			node2 = node2.next;
		}
	}
}
