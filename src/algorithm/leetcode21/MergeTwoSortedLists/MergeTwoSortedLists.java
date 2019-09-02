package algorithm.leetcode21.MergeTwoSortedLists;

public class MergeTwoSortedLists {
	public static ListNode mergeTwoLists(ListNode l1,ListNode l2) {
		ListNode ans = new ListNode(0);
		ListNode temp = ans	;
		
		while(l1 != null && l2 != null) {
			if(l1.val < l2.val) {
				ListNode temp1 = new ListNode(0);
				temp1.val = l1.val;
				temp1.next = null;
				temp.next = temp1;
				temp = temp.next;
				l1 = l1.next;
			}
			else if(l1.val > l2.val) {
				ListNode temp1 = new ListNode(0);
				temp1.val = l2.val;
				temp1.next = null;
				temp.next = temp1;
				temp = temp.next;
				l2 = l2.next;
			}
			else {
				ListNode temp1 = new ListNode(0);
				temp1.val = l1.val;
				temp1.next = null;
				temp.next = temp1;
				temp = temp.next;
				l1 = l1.next;
				
				ListNode temp2 = new ListNode(0);
				temp2.val = l2.val;
				temp2.next = null;
				temp.next = temp2;
				temp = temp.next;
				l2 = l2.next;
			}
		}
		if(l1 != null) temp.next = l1;
		else if(l2 != null) temp.next = l2;
		return ans.next;
	}
	
	public static void main(String args[]) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		System.out.println("hahahah");
		ListNode ans = mergeTwoLists(l1, l2);
		
		while(ans != null) {
			System.out.println(ans.val);
			ans = ans.next;
		}
		
	}
}
